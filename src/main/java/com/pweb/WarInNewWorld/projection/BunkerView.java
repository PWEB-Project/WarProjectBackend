package com.pweb.WarInNewWorld.projection;

import java.sql.Date;

public interface BunkerView {
    Long getId();
    String getAddress();
    Integer getMaximCapacity();
    Integer getCurrentCapacity();
    Date getLastUpdate();
}
