package com.pweb.WarInNewWorld.model;

import javax.persistence.*;

@Entity
@Table(name = "pwb_subscribers")
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "subscriber_id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "subscribers_county")
    private Integer countyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }
}
