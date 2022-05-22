package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.Subscriber;
import com.pweb.WarInNewWorld.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/subscriber")
public class SubscriberController {
    @Autowired
    SubscriberService subscriberService;

    @PostMapping(path = "/admin/add-subscriber")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<?> addUser(@RequestBody Subscriber subscriber) {
        try {
            subscriberService.addSubscriber(subscriber);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping(path = "/admin/delete-subscriber/{id}")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            subscriberService.deleteSubscriber(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
