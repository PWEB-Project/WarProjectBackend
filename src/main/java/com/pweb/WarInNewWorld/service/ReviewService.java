package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.Review;
import com.pweb.WarInNewWorld.projection.ReviewView;
import com.pweb.WarInNewWorld.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public void addReview(Review review)
    {
        reviewRepository.save(review);
    }

    public void deleteReview(Long reviewId)
    {
        reviewRepository.deleteById(reviewId);
    }

    public List<ReviewView> getAllReviewsForNews(Long id){
        return reviewRepository.findAllByWhomId(id);
    }
}
