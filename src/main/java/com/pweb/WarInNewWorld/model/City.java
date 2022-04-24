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
    private County county;

    @Column(name = "city_name")
    private String cityName;

    @OneToMany(mappedBy = "city", cascade = CascadeType.PERSIST)
    private Set<Bunker> bunkers = new HashSet<>();

    @ManyToMany(mappedBy = "cities", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    private Set<Subscriber> subscribers = new HashSet<>();

    @OneToMany(mappedBy = "city", cascade = CascadeType.PERSIST)
    private Set<NecessityGoods> necessityGoods = new HashSet<>();

    @ManyToMany(mappedBy = "cities")
    private Set<News> news = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Set<Bunker> getBunkers() {
        return bunkers;
    }

    public void setBunkers(Set<Bunker> bunkers) {
        this.bunkers = bunkers;
    }

    public Set<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Set<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public Set<NecessityGoods> getNecessityGoods() {
        return necessityGoods;
    }

    public void setNecessityGoods(Set<NecessityGoods> necessityGoods) {
        this.necessityGoods = necessityGoods;
    }

    public Set<News> getNews() {
        return news;
    }

    public void setNews(Set<News> news) {
        this.news = news;
    }
}
