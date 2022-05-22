package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.Subscriber;
import com.pweb.WarInNewWorld.projection.SubscribersView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
    List<SubscribersView> findAllByCountyId(Integer id);
}
