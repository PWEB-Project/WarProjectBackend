package com.pweb.WarInNewWorld.projection;

import com.pweb.WarInNewWorld.model.GoodsType;

import java.sql.Date;

public interface NecessityGoodsView {
    Long getId();
    String getAddress();
    Integer getMaximCapacity();
    Integer getCurrentCapacity();
    Date getLastUpdate();
}
