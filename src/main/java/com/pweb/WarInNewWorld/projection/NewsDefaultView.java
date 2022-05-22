package com.pweb.WarInNewWorld.projection;

import java.sql.Date;
import java.util.List;

public interface NewsDefaultView {
    Long getId();
    Date getPublicationDate();
    Integer getCountyId();
    String getBody();
    String getTitle();
    String getWriter();
}
