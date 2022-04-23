package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pwb_counties")
public class GoodsTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "good_type_id")
    private Long id;

    @Column(name = "good_type_name")
    private String goodTypeName;

}
