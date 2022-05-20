package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.model.ReviewType;
import com.pweb.WarInNewWorld.projection.ReviewTypeView;
import com.pweb.WarInNewWorld.service.ReviewService;
import com.pweb.WarInNewWorld.service.ReviewTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
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

    @DeleteMapping(path = "/admin/delete-review-type/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            reviewTypeService.deleteReviewType(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping(path = "/get-all-review-types")
    List<ReviewTypeView> getAllReviewTypes()
    {
        return reviewTypeService.getAllReviewType();
    }
}
