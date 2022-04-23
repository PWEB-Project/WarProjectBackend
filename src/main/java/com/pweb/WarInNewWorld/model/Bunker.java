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

    @Column(name = "last_uodate")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}
