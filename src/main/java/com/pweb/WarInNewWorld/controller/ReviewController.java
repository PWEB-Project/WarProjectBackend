package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.Review;
import com.pweb.WarInNewWorld.projection.BunkerView;
import com.pweb.WarInNewWorld.projection.ReviewView;
import com.pweb.WarInNewWorld.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/review")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @PostMapping(path = "/admin/add-review")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<?> addUser(@RequestBody Review review) {
        try {
            reviewService.addReview(review);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping(path = "/admin/delete-review/{id}")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            reviewService.deleteReview(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping(path = "/getReviewsByNews/{id}")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    public List<ReviewView> getReviewsByNewsId(@PathVariable Long id){
        return reviewService.getAllReviewsForNews(id);
    }
}
