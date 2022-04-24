package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.NecessityGoods;
import com.pweb.WarInNewWorld.repository.NecessityGoodsRepository;
import org.springframework.stereotype.Service;

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
}
