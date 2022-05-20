package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.dto.NecessityGoodsDTO;
import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.model.NecessityGoods;
import com.pweb.WarInNewWorld.projection.NecessityGoodsView;
import com.pweb.WarInNewWorld.repository.NecessityGoodsRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NecessityGoodsService {
    private NecessityGoodsRepository necessityGoodsRepository;

    public NecessityGoodsService(NecessityGoodsRepository necessityGoodsRepository) {
        this.necessityGoodsRepository = necessityGoodsRepository;
    }

    public void addNecessityGoods(NecessityGoods necessityGoods)
    {
        necessityGoodsRepository.save(necessityGoods);
    }

    public void deleteNecessityGoods(Long necessityGoodsId)
    {
        necessityGoodsRepository.deleteById(necessityGoodsId);
    }

    public List<NecessityGoodsView> getAllNecessityGoodsByCityId(Integer cityId) { return necessityGoodsRepository.findNecessityGoodsByCityId(cityId); }

    public NecessityGoods getNecessityGoodsById(Long id) { return necessityGoodsRepository.getById(id); }

    public void saveNecessityGoods(NecessityGoods necessityGoods) { necessityGoodsRepository.save(necessityGoods); }
}
