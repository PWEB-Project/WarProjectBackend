package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.dto.BunkerDTO;
import com.pweb.WarInNewWorld.dto.convertor.BunkerConvertor;
import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.projection.BunkerView;
import com.pweb.WarInNewWorld.service.BunkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/bunker")
public class BunkerController {
    @Autowired
    BunkerService bunkerService;

    @PostMapping(path = "/admin/add-bunker")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
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
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<?> deleteBunker(@PathVariable Long id) {
        try {
            bunkerService.deleteBunker(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping(path = "/admin/get-bunkers-by-city-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    public List<BunkerView> getBunkersByCityId(@PathVariable Integer id){
        List<BunkerView> bunkerViews = new ArrayList<>();

        bunkerViews = bunkerService.getAllBunkerByCityId(id);
        return bunkerViews;
    }

    @PutMapping(path = "/edit")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:8080")
    public void editBunker(BunkerDTO bunkerDTO) throws ParseException {
        Bunker bunker = BunkerConvertor.convertToEntity(bunkerDTO);
        Bunker oldBunker = bunkerService.getBunkerById(bunker.getId());
        bunker.setLastUpdate(new Date(System.currentTimeMillis()));
        bunker.setCityId(oldBunker.getCityId());

        bunkerService.saveBunker(bunker);
    }
}
