package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.projection.BunkerView;
import com.pweb.WarInNewWorld.repository.BunkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<BunkerView> getAllBunkerByCityId(Long cityId) { return bunkerRepository.findBunkerByCity_Id(cityId); }

}
