package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.NewsType;
import com.pweb.WarInNewWorld.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/news-type")
public class NewsTypeController {
    @Autowired
    NewsTypeService newsTypeService;

    @PostMapping(path = "/admin/add-news-type")
    public ResponseEntity<?> addUser(@RequestBody NewsType newsType) {
        try {
            newsTypeService.addNewsType(newsType);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping(path = "/admin/delete-news-type/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            newsTypeService.deleteNewsType(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
