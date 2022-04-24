package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.City;
import com.pweb.WarInNewWorld.model.News;
import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.projection.NewsDefaultView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<NewsDefaultView> findAllBy();
    List<NewsDefaultView> findAllByCitiesAndIsValidatedAndNewsType(Set<City> cities, Boolean isValidated, NewsType newsType);
}
