package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.dto.BunkerDTO;
import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.projection.BunkerView;
import com.pweb.WarInNewWorld.service.BunkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/bunker")
public class BunkerController {
    @Autowired
    BunkerService bunkerService;

    @PostMapping(path = "/admin/add-bunker")
    public ResponseEntity<?> addBunker(@RequestBody Bunker bunker) {
        try {
            bunkerService.addBunker(bunker);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping(path = "/admin/delete-bunker/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteBunker(@PathVariable Long id) {
        try {
            bunkerService.deleteBunker(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping(path = "/admin/get-bunkers-by-city-id/{id}")
    public List<BunkerView> getBunkersByCityId(@PathVariable Long id){
        List<BunkerView> bunkerViews = new ArrayList<>();

        bunkerViews = bunkerService.getAllBunkerByCityId(id);
        return bunkerViews;
    }
}
