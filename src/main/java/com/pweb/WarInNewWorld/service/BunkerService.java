package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.repository.BunkerRepository;
import org.springframework.stereotype.Service;

@Service
public class BunkerService {
    private BunkerRepository bunkerRepository;

    public BunkerService(BunkerRepository bunkerRepository) {
        this.bunkerRepository = bunkerRepository;
    }

    public void addBunker(Bunker bunker){
        bunkerRepository.save(bunker);
    }

    public void deleteBunker(Long bunkerId){
        bunkerRepository.deleteById(bunkerId);
    }

}
