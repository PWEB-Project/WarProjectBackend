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

    @Column(name  = "file_link")
    private String fileLink;

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
    @JoinColumn(name = "writer_id", insertable = false,updatable = false)
    private User writer;

    @ManyToOne
    @JoinColumn(name = "validator_id", insertable = false,updatable = false)
    private User validator;

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

    public Boolean getValidated() {
        return isValidated;
    }

    public void setValidated(Boolean validated) {
        isValidated = validated;
    }

    public NewsType getNewsType() {
        return newsType;
    }

    public void setNewsType(NewsType newsType) {
        this.newsType = newsType;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public User getWriter() {
        return writer;
    }

    public void setWriter(User writer) {
        this.writer = writer;
    }

    public User getValidator() {
        return validator;
    }

    public void setValidator(User validator) {
        this.validator = validator;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
}
