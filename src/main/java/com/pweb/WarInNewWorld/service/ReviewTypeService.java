package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.ReviewType;
import com.pweb.WarInNewWorld.projection.ReviewTypeView;
import com.pweb.WarInNewWorld.repository.ReviewTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewTypeService {
    private ReviewTypeRepository reviewTypeRepository;

    public ReviewTypeService(ReviewTypeRepository reviewTypeRepository) {
         this.reviewTypeRepository = reviewTypeRepository;
    }

    public void addReviewType(ReviewType reviewType) {
        reviewTypeRepository.save(reviewType);
    }

    public void deleteReviewType(Long reviewTypeId) {
        reviewTypeRepository.deleteById(reviewTypeId);
    }

    public List<ReviewTypeView> getAllReviewType()
    {
        return reviewTypeRepository.findAllBy();
    }
}
