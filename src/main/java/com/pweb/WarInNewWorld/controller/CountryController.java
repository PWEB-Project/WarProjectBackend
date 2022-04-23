package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/country")
public class CountryController {
    @Autowired
    CountryService countryService;
}
