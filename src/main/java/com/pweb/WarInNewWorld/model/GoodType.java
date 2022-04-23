package com.pweb.WarInNewWorld.model;

import javax.persistence.*;

@Entity
@Table(name = "pwb_counties")
public class GoodType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "good_type_id")
    private Long id;

    @Column(name = "good_type_name")
    private String goodTypeName;

}
