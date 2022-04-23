package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/news")
public class NewsController {
    @Autowired
    NewsService newsService;
}
