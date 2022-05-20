package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.GoodsType;
import com.pweb.WarInNewWorld.projection.GoodsTypeView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsTypeRepository extends JpaRepository<GoodsType, Long> {
    List<GoodsTypeView> findAllBy();
}
