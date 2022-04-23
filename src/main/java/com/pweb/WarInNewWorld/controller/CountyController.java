package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.service.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/county")
public class CountyController {
    @Autowired
    CountyService countyService;
}
