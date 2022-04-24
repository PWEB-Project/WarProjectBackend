package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.Subscriber;
import com.pweb.WarInNewWorld.repository.SubscriberRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {
    private SubscriberRepository subscriberRepository;

    public SubscriberService(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    public void addSubscriber(Subscriber subscriber)
    {
        subscriberRepository.save(subscriber);
    }

    public void deleteSubscriber(Long subscriberId) {
        subscriberRepository.deleteById(subscriberId);
    }
}
