package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.repository.NewsRepository;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    private NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
}
