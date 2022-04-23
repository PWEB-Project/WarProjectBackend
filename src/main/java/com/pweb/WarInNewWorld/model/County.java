package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pwb_counties")
public class County {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "county_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "county_name")
    private String countyName;

    @OneToMany(mappedBy = "county", cascade = CascadeType.PERSIST)
    private Set<City> cities = new HashSet<>();
}
