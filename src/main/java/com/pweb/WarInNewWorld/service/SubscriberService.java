package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.Subscriber;
import com.pweb.WarInNewWorld.projection.SubscribersView;
import com.pweb.WarInNewWorld.repository.SubscriberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<SubscribersView> getSubscribersToCounty(Integer id){
        return subscriberRepository.findAllByCountyId(id);
    }
}
