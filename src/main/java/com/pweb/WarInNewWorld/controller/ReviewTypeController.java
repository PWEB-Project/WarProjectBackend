package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.model.ReviewType;
import com.pweb.WarInNewWorld.service.ReviewService;
import com.pweb.WarInNewWorld.service.ReviewTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/review-type")
public class ReviewTypeController {
    @Autowired
    ReviewTypeService reviewTypeService;

    @PostMapping(path = "/admin/add-review-type")
    public ResponseEntity<?> addUser(@RequestBody ReviewType reviewType) {
        try {
            reviewTypeService.addReviewType(reviewType);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
