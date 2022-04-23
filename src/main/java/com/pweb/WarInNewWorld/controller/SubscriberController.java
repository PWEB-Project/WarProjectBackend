package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/subscriber")
public class SubscriberController {
    @Autowired
    SubscriberService subscriberService;
}
