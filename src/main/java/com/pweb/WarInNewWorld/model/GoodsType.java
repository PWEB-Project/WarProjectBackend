package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pwb_goods_types")
public class GoodsType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "goods_type_id")
    private Long id;

    @Column(name = "goods_type_name")
    private String goodTypeName;

    @OneToMany(mappedBy = "goodsType", cascade = CascadeType.PERSIST)
    private Set<NecessityGoods> necessityGoods = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodTypeName() {
        return goodTypeName;
    }

    public void setGoodTypeName(String goodTypeName) {
        this.goodTypeName = goodTypeName;
    }

    public Set<NecessityGoods> getNecessityGoods() {
        return necessityGoods;
    }

    public void setNecessityGoods(Set<NecessityGoods> necessityGoods) {
        this.necessityGoods = necessityGoods;
    }
}
