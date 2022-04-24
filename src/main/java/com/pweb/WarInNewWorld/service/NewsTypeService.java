package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.repository.BunkerRepository;
import com.pweb.WarInNewWorld.repository.NewsTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class NewsTypeService {
    private NewsTypeRepository newsTypeRepository;

    public NewsTypeService(NewsTypeRepository newsTypeRepository) {
        this.newsTypeRepository = newsTypeRepository;
    }

    public void addNewsType(NewsType newsType){
        newsTypeRepository.save(newsType);
    }
}
