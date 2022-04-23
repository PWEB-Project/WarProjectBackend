package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pwb_news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "news_id")
    private Long id;

    @Column(name = "publication_date")
    private Date publicationDate;

    @Column(name  = "body")
    private String body;

    @Column(name  = "title")
    private String title;

    @Column(name  = "is_validated")
    private Boolean isValidated;

    @ManyToOne
    @JoinColumn(name = "news_type_id")
    private NewsType newsType;

    @ManyToMany
    @JoinTable(
            name = "pwb_news_cities",
            joinColumns = { @JoinColumn(name = "news_id") },
            inverseJoinColumns = { @JoinColumn(name = "city_id") }
    )
    private Set<City> cities = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User writer;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User validator;
}
