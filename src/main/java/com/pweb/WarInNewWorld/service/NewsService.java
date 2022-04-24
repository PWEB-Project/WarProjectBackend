package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.City;
import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.projection.NewsDefaultView;
import com.pweb.WarInNewWorld.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class NewsService {
    private NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }


    public List<NewsDefaultView> getDefaultNews(){
        return newsRepository.findAllBy();
    }

    public List<NewsDefaultView> getDefaultNewsByCitiesIsValidatedAndNewsType(Set<City> cities, NewsType newsType){
        return newsRepository.findAllByCitiesAndIsValidatedAndNewsType(cities, true, newsType);
    }
}
