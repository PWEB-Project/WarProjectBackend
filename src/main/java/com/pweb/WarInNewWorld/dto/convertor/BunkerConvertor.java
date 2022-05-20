package com.pweb.WarInNewWorld.dto.convertor;


import com.pweb.WarInNewWorld.dto.BunkerDTO;
import com.pweb.WarInNewWorld.model.Bunker;
import org.modelmapper.ModelMapper;

import java.text.ParseException;

public class BunkerConvertor {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static Bunker convertToEntity(BunkerDTO bunkerDTO) throws ParseException {
        return modelMapper.map(bunkerDTO, Bunker.class);
    }

    public static BunkerDTO convertToDTO(Bunker bunker) {
        return modelMapper.map(bunker, BunkerDTO.class);
    }
}
