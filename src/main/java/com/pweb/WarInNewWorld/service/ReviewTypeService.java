package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.ReviewType;
import com.pweb.WarInNewWorld.repository.ReviewTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewTypeService {
    private ReviewTypeRepository reviewTypeRepository;

    public ReviewTypeService(ReviewTypeRepository reviewTypeRepository) {
         this.reviewTypeRepository = reviewTypeRepository;
    }

    public void addReviewType(ReviewType reviewType) {
        reviewTypeRepository.save(reviewType);
    }
}
