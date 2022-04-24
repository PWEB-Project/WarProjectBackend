package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.City;
import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.projection.NewsDefaultView;
import com.pweb.WarInNewWorld.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/news")
public class NewsController {
    @Autowired
    NewsService newsService;

    @PostMapping(path = "/get-news-cities")
    List<NewsDefaultView> getNews(@RequestBody List<City> cities, @RequestBody NewsType newsType){
        return newsService.getDefaultNewsByCitiesIsValidatedAndNewsType(cities, newsType);
    }

    @PostMapping(path = "/get-news-all")
    List<NewsDefaultView> getNewsAll(){
        return newsService.getDefaultNews();
    }
}
