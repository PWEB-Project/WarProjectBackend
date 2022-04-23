package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.service.NecessityGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/necessity")
public class NecessityGoodsController {
    @Autowired
    NecessityGoodsService necessityGoodsService;
}
