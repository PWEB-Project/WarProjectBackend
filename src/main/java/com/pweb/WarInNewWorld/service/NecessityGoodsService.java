package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.NecessityGoods;
import com.pweb.WarInNewWorld.projection.NecessityGoodsView;
import com.pweb.WarInNewWorld.repository.NecessityGoodsRepository;
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

    public List<NecessityGoodsView> getAllNecessityGoodsByCityId(Long cityId) { return necessityGoodsRepository.findNecessityGoodsByCity_Id(cityId); }
}
