package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.City;
import com.pweb.WarInNewWorld.model.News;
import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.projection.NewsDefaultView;
import com.pweb.WarInNewWorld.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/news")
public class NewsController {
    @Autowired
    NewsService newsService;

    @PostMapping(path = "/admin/add-news")
    public ResponseEntity<?> addUser(@RequestBody News news) {
        try {
            newsService.addNews(news);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PostMapping(path = "/get-news-cities")
    List<NewsDefaultView> getNews(@RequestBody List<City> cities, @RequestBody NewsType newsType){
        return newsService.getDefaultNewsByCitiesIsValidatedAndNewsType(cities, newsType);
    }

    @PostMapping(path = "/get-news-all")
    List<NewsDefaultView> getNewsAll(){
        return newsService.getDefaultNews();
    }
}
