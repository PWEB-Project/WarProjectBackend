package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.dto.CountyTypesDTO;
import com.pweb.WarInNewWorld.model.News;
import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.projection.NewsDefaultView;
import com.pweb.WarInNewWorld.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping(path = "/admin/delete-news/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            newsService.deleteNews(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PostMapping(path = "/get-news-by-county-and-types")
    List<NewsDefaultView> getNews(@RequestBody CountyTypesDTO countyTypesDTO){
        return newsService.getDefaultNewsByCitiesIsValidatedAndNewsType(countyTypesDTO.getCountyId(), countyTypesDTO.getNewsTypeId());
    }

    @GetMapping(path = "/get-news-all")
    List<NewsDefaultView> getNewsAll(){
        return newsService.getDefaultNews();
    }
}
