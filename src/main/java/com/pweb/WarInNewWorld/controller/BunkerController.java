package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.service.BunkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/bunker")
public class BunkerController {
    @Autowired
    BunkerService bunkerService;

    @PostMapping(path = "/admin/add-bunker")
    public ResponseEntity<?> addUser(@RequestBody Bunker bunker) {
        try {
            bunkerService.addBunker(bunker);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping(path = "/admin/delete-bunker/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            bunkerService.deleteBunker(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
