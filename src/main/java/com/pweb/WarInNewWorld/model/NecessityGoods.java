package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pwb_necessity_goods")
public class NecessityGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "necessity_good_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name  = "address")
    private String address;

    @Column(name  = "maxim_capacity")
    private String maximCapacity;

    @Column(name  = "current_capacity")
    private String currentCapacity;

    @Column(name  = "last_update")
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "goods_type_id")
    private GoodsType goodsType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaximCapacity() {
        return maximCapacity;
    }

    public void setMaximCapacity(String maximCapacity) {
        this.maximCapacity = maximCapacity;
    }

    public String getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(String currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }
}