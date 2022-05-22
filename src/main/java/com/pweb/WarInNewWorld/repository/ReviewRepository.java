package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.Review;
import com.pweb.WarInNewWorld.projection.ReviewView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<ReviewView> findAllByWhomId(Long newsId);
}
