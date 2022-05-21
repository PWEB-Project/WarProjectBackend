package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.NecessityGoods;
import com.pweb.WarInNewWorld.projection.BunkerView;
import com.pweb.WarInNewWorld.projection.NecessityGoodsView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NecessityGoodsRepository extends JpaRepository<NecessityGoods, Long> {
    List<NecessityGoodsView> findNecessityGoodsByCityId(Integer cityId);

}
