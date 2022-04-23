package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pwb_bunkers")
public class Bunker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "bunker_id")
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "maxim_capacity")
    private Integer maximCapacity;

    @Column(name = "current_capacity")
    private Integer currentCapacity;

    @Column(name = "last_update")
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

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

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
