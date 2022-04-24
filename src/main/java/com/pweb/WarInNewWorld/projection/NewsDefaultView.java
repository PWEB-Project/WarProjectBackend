package com.pweb.WarInNewWorld.projection;

import java.sql.Date;
import java.util.List;

public interface NewsDefaultView {
    Long getId();
    Date getPublicationDate();
    List<CityView> getCities();
    String getBody();
    String getTitle();
    UserNewsView getWriter();
}
