package com.pweb.WarInNewWorld.service;

import com.pweb.WarInNewWorld.model.GoodsType;
import com.pweb.WarInNewWorld.projection.BunkerView;
import com.pweb.WarInNewWorld.projection.GoodsTypeView;
import com.pweb.WarInNewWorld.repository.GoodsTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeService {
    private GoodsTypeRepository goodsTypeRepository;

    public GoodsTypeService(GoodsTypeRepository goodsTypeRepository)
    {
        this.goodsTypeRepository = goodsTypeRepository;
    }

    public void addGoodsType(GoodsType goodsType)
    {
        goodsTypeRepository.save(goodsType);
    }

    public void deleteGoodsType(Long goodsTypeId)
    {
        goodsTypeRepository.deleteById(goodsTypeId);
    }

    public List<GoodsTypeView> getAllGoodsType() { return goodsTypeRepository.findAllBy(); }

}
