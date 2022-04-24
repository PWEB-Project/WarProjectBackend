package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.GoodsType;
import com.pweb.WarInNewWorld.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/goods-type")
public class GoodsTypeController {
    @Autowired
    GoodsTypeService goodsTypeService;

    @PostMapping(path = "/admin/add-bunker")
    public ResponseEntity<?> addUser(@RequestBody GoodsType goodsType) {
        try {
            goodsTypeService.addGoodsType(goodsType);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
