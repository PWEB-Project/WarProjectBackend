package com.pweb.WarInNewWorld.model;

import javax.persistence.*;

@Entity
@Table(name = "pwb_cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "city_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "county_id")
    private Country county;

    @Column(name = "city_name")
    private String cityName;
}
