package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pwb_reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "reviews_id")
    private Long id;

    @Column(name = "publication_date")
    private Date publicationDate;

    @Column(name  = "content")
    private String content;

    @Column(name  = "analysed")
    private Boolean analysed;

    @Column(name  = "is_validated")
    private Boolean isValidated;

    @ManyToOne
    @JoinColumn(name = "review_type_id")
    private NewsType reviewType;
}
