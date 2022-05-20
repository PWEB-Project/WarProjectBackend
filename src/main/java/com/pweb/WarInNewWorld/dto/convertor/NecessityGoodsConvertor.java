package com.pweb.WarInNewWorld.dto.convertor;

import com.pweb.WarInNewWorld.dto.BunkerDTO;
import com.pweb.WarInNewWorld.dto.NecessityGoodsDTO;
import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.model.NecessityGoods;
import org.modelmapper.ModelMapper;

import java.text.ParseException;

public class NecessityGoodsConvertor {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static NecessityGoods convertToEntity(NecessityGoodsDTO necessityGoodsDTO) throws ParseException {
        return modelMapper.map(necessityGoodsDTO, NecessityGoods.class);
    }

    public static NecessityGoodsDTO convertToDTO(NecessityGoods necessityGoods) {
        return modelMapper.map(necessityGoods, NecessityGoodsDTO.class);
    }

}
