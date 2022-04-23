package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "writer", cascade = CascadeType.PERSIST)
    private Set<News> writtenNews = new HashSet<>();

    @OneToMany(mappedBy = "validator", cascade = CascadeType.PERSIST)
    private Set<News> validatedNews = new HashSet<>();

    @OneToMany(mappedBy = "whom", cascade = CascadeType.PERSIST)
    private Set<Review> receivedReviews = new HashSet<>();

    @OneToMany(mappedBy = "writer", cascade = CascadeType.PERSIST)
    private Set<Review> writtenReviews = new HashSet<>();
}
