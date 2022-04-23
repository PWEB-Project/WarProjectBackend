package com.pweb.WarInNewWorld.model;

import javax.persistence.*;

@Entity
@Table(name = "pwb_bunkers")
public class Bunker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "bunker_id")
    private Long id;

    @Column(name = "buncker_address")
    private String address;

    @Column(name = "maxim_capacity")
    private Integer maximCapacity;

    @Column(name = "current_capacity")
    private Integer currentCapacity;


}
