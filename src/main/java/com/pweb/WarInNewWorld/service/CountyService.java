package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.repository.CountyRepository;
import org.springframework.stereotype.Service;

@Service
public class CountyService {
    private CountyRepository countyRepository;

    public CountyService(CountyRepository countyRepository) {
        this.countyRepository = countyRepository;
    }
}
