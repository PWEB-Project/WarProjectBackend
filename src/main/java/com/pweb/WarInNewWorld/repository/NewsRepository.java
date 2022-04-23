package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
