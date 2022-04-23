package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.repository.BunkerRepository;
import org.springframework.stereotype.Service;

@Service
public class BunkerService {
    private BunkerRepository bunkerRepository;

    public BunkerService(BunkerRepository bunkerRepository) {
        this.bunkerRepository = bunkerRepository;
    }

}
