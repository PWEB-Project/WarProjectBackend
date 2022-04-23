package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "city", cascade = CascadeType.PERSIST)
    private Set<Bunker> bunkers = new HashSet<>();

    @ManyToMany(mappedBy = "cities")
    private Set<Subscriber> subscribers = new HashSet<>();

    @OneToMany(mappedBy = "city", cascade = CascadeType.PERSIST)
    private Set<NecessityGoods> necessityGoods = new HashSet<>();

    @ManyToMany(mappedBy = "cities")
    private Set<News> news = new HashSet<>();


}
