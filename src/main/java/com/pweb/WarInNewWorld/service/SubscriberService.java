package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.repository.SubscriberRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {
    private SubscriberRepository subscriberRepository;

    public SubscriberService(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }
}
