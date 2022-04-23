package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pwb_user_types")
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "user_type_id")
    private Long id;

    @Column(name = "type_name")
    private String name;

    @OneToMany(mappedBy = "userType")
    private Set<User> users = new HashSet<>();
}
