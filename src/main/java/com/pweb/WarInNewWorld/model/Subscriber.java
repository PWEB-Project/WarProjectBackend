package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pwb_subscribers")
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "subscriber_id")
    private Long id;

    @Column(name = "email")
    private String email;

    @ManyToMany
    @JoinTable(
            name = "pwb_subscribers_cities",
            joinColumns = { @JoinColumn(name = "subscriber_id") },
            inverseJoinColumns = { @JoinColumn(name = "city_id") }
    )
    private Set<City> cities = new HashSet<>();
}
