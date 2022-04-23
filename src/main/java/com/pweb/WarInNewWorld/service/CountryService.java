package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
}
