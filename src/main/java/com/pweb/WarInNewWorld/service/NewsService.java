package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.News;
import com.pweb.WarInNewWorld.projection.NewsDefaultView;
import com.pweb.WarInNewWorld.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<NewsDefaultView> getDefaultNewsByCitiesIsValidatedAndNewsType(Integer countyId, Long newsTypeId){
        return newsRepository.findNewsByCountyIdAndNewsType_Id(countyId, newsTypeId);
    }

    public List<NewsDefaultView> getDefaultNews(){
        return newsRepository.findNewsBy();
    }

    public List<NewsDefaultView> getNews(){
        return newsRepository.findNewsByNewsType_NewsTypeName("news");
    }

    public List<NewsDefaultView> getArticles(){
        return newsRepository.findNewsByNewsType_NewsTypeName("article");
    }
}
