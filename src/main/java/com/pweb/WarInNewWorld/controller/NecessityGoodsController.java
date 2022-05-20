package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.dto.BunkerDTO;
import com.pweb.WarInNewWorld.dto.NecessityGoodsDTO;
import com.pweb.WarInNewWorld.dto.convertor.BunkerConvertor;
import com.pweb.WarInNewWorld.dto.convertor.NecessityGoodsConvertor;
import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.model.NecessityGoods;
import com.pweb.WarInNewWorld.projection.BunkerView;
import com.pweb.WarInNewWorld.projection.NecessityGoodsView;
import com.pweb.WarInNewWorld.service.NecessityGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

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

    @DeleteMapping(path = "/admin/delete-necessity-goods/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        try {
            necessityGoodsService.deleteNecessityGoods(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping(path = "/admin/get-necessity-goods-by-city-id/{id}")
    public List<NecessityGoodsView> getNecessityGoodsByCityId(@PathVariable Integer id){
        List<NecessityGoodsView> necessityGoodsViews = new ArrayList<>();

        necessityGoodsViews = necessityGoodsService.getAllNecessityGoodsByCityId(id);
        return necessityGoodsViews;
    }

    @PutMapping(path = "/edit")
    @ResponseStatus(HttpStatus.OK)
    public void editNecessityGoods(NecessityGoodsDTO necessityGoodsDTO) throws ParseException {
        NecessityGoods necessityGoods = NecessityGoodsConvertor.convertToEntity(necessityGoodsDTO);
        NecessityGoods oldNecessityGoods = necessityGoodsService.getNecessityGoodsById(necessityGoods.getId());
        necessityGoods.setLastUpdate(new Date(System.currentTimeMillis()));
        necessityGoods.setCityId(oldNecessityGoods.getCityId());

        necessityGoodsService.saveNecessityGoods(necessityGoods);
    }
}
