package com.pweb.WarInNewWorld.model;

import javax.persistence.*;

@Entity
@Table(name = "pwb_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "user_id")
    private Long id;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "user_type_id")
    private UserType userType;
}
