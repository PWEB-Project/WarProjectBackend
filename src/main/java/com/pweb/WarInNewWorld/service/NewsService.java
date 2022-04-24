package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.City;
import com.pweb.WarInNewWorld.model.News;
import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.projection.NewsDefaultView;
import com.pweb.WarInNewWorld.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class NewsService {
    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public void addNews(News news)
    {
        newsRepository.save(news);
    }

    public void deleteNews(Long newsId)
    {
        newsRepository.deleteById(newsId);
    }

    public List<NewsDefaultView> getDefaultNews(){
        return newsRepository.findAllBy();
    }

    public List<NewsDefaultView> getDefaultNewsByCitiesIsValidatedAndNewsType(List<City> cities, NewsType newsType){
         newsRepository.findAllByCitiesInAndIsValidatedAndNewsType(cities, true, newsType);
//        return newsRepository.findAllBy();
        return null;
    }
}
