package com.pweb.WarInNewWorld.dto;

import com.pweb.WarInNewWorld.model.GoodsType;

public class NecessityGoodsDTO {
    Long id;
    String address;
    Integer maximCapacity;
    Integer currentCapacity;
    Long goodsTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMaximCapacity() {
        return maximCapacity;
    }

    public void setMaximCapacity(Integer maximCapacity) {
        this.maximCapacity = maximCapacity;
    }

    public Integer getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public Long getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Long goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }
}
