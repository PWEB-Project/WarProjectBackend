package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
