package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.projection.BunkerView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BunkerRepository extends JpaRepository<Bunker, Long> {
    List<BunkerView> findBunkerByCity_Id(Long cityId);
}
