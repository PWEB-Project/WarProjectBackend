package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.NecessityGoods;
import com.pweb.WarInNewWorld.service.NecessityGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/necessity")
public class NecessityGoodsController {
    @Autowired
    NecessityGoodsService necessityGoodsService;

    @PostMapping(path = "/admin/add-necessity-goods")
    public ResponseEntity<?> addUser(@RequestBody NecessityGoods necessityGoods) {
        try {
            necessityGoodsService.addNecessityGoods(necessityGoods);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
