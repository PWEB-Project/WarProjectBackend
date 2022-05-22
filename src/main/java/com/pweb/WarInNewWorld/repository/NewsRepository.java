package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.News;
import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.projection.NewsDefaultView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    List<NewsDefaultView> findNewsBy();
    List<NewsDefaultView> findNewsByCountyIdAndNewsType_Id(Integer countryId, Long newsTypeId);
    List<NewsDefaultView> findNewsByNewsType_NewsTypeName(String name);
//    Set<NewsDefaultView> findAllByCitiesInAndIsValidatedAndNewsType(List<City> cities, Boolean isValidated, NewsType newsType);
}
