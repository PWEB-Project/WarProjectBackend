package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.City;
import com.pweb.WarInNewWorld.model.Country;
import com.pweb.WarInNewWorld.repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    private CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public void addCity(City city)
    {
        cityRepository.save(city);
    }
}
