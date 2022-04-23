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
}
