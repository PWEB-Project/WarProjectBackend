package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pwb_news_types")
public class NewsType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "news_type_id")
    private Long id;

    @Column(name = "news_type_name")
    private String newsTypeName;

    @OneToMany(mappedBy = "newsType", cascade = CascadeType.PERSIST)
    private Set<News> news = new HashSet<>();
}
