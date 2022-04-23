package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/city")
public class CityController {
    @Autowired
    CityService cityService;
}
