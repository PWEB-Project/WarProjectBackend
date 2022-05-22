package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.dto.CountyTypesDTO;
import com.pweb.WarInNewWorld.model.News;
import com.pweb.WarInNewWorld.projection.NewsDefaultView;
import com.pweb.WarInNewWorld.projection.SubscribersView;
import com.pweb.WarInNewWorld.service.NewsService;
import com.pweb.WarInNewWorld.service.RabbitMQSender;
import com.pweb.WarInNewWorld.service.SubscriberService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/news")
public class NewsController {
    @Autowired
    NewsService newsService;

    @Autowired
    RabbitMQSender rabbitMQSender;

    @Autowired
    SubscriberService subscriberService;

    @Autowired
    private JavaMailSender emailSender;

    @PostMapping(path = "/admin/add-news")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<?> addNews(@RequestBody News news) {
        try {
            newsService.addNews(news);
            JSONObject mqObj = new JSONObject();
            mqObj.put("message", news.getTitle());
            mqObj.put("county", news.getCountyId());
            rabbitMQSender.send(mqObj.toString());
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping(path = "/admin/delete-news/{id}")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            newsService.deleteNews(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PostMapping(path = "/get-news-by-county-and-types")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    List<NewsDefaultView> getNews(@RequestBody CountyTypesDTO countyTypesDTO){
        return newsService.getDefaultNewsByCitiesIsValidatedAndNewsType(countyTypesDTO.getCountyId(), countyTypesDTO.getNewsTypeId());
    }

    @GetMapping(path = "/get-news-all")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    List<NewsDefaultView> getNewsAll(){
        return newsService.getDefaultNews();
    }

    @GetMapping(path = "/get-news")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    List<NewsDefaultView> getNews(){
        return newsService.getNews();
    }

    @GetMapping(path = "/get-articles")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    List<NewsDefaultView> getArticles(){
        return newsService.getArticles();
    }

    @RabbitListener(queues = "${WarInNewWorld.rabbitmq.queue}")
    public void listen(String in) {
        JSONObject object ;
        try {
            System.out.println(in);
            object = new JSONObject(in);
            List<SubscribersView> subscribersViews = subscriberService.getSubscribersToCounty((Integer) object.get("county"));
            for (SubscribersView subscribers: subscribersViews) {
                sendSimpleMessage(subscribers.getEmail(), "News about war", (String) object.get("message"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println("Message read from myQueue : " + in);
    }

    public void sendSimpleMessage(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("pweb.tema@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }
}
