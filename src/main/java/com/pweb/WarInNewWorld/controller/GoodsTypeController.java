package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.model.GoodsType;
import com.pweb.WarInNewWorld.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/goods-type")
public class GoodsTypeController {
    @Autowired
    GoodsTypeService goodsTypeService;

    @PostMapping(path = "/admin/add-goods-type")
    public ResponseEntity<?> addUser(@RequestBody GoodsType goodsType) {
        try {
            goodsTypeService.addGoodsType(goodsType);
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.CREATED);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping(path = "/admin/delete-goods-type/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            goodsTypeService.deleteGoodsType(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
