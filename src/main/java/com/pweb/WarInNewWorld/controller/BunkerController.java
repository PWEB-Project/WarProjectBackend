package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.service.BunkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/bunker")
public class BunkerController {
    @Autowired
    BunkerService bunkerService;
}
