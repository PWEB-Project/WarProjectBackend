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

    @ManyToOne
    @JoinColumn(name = "news_type_id")
    private NewsType newsType;

    @Column(name = "news_county")
    private Integer countyId;

    @Column(name = "writer_name")
    private String writer;
    ;

    @OneToMany(mappedBy = "whom", cascade = CascadeType.PERSIST)
    private Set<Review> receivedReviews = new HashSet<>();

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NewsType getNewsType() {
        return newsType;
    }

    public void setNewsType(NewsType newsType) {
        this.newsType = newsType;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Set<Review> getReceivedReviews() {
        return receivedReviews;
    }

    public void setReceivedReviews(Set<Review> receivedReviews) {
        this.receivedReviews = receivedReviews;
    }
}
