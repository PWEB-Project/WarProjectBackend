package com.pweb.WarInNewWorld.dto;

import com.pweb.WarInNewWorld.projection.CountryView;

import java.util.List;

public class CountriesDTO {
    List<CountryDTO> countries;

    public List<CountryDTO> getCountries() {
        return countries;
    }

    public void setCountries(List<CountryDTO> countries) {
        this.countries = countries;
    }
}
