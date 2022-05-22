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

    @ManyToOne
    @JoinColumn(name = "whom_id", insertable = false,updatable = false)
    private News whom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News getWhom() {
        return whom;
    }

    public void setWhom(News whom) {
        this.whom = whom;
    }
}
