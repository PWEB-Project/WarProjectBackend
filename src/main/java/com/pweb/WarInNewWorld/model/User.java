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

    @Column(name = "trusted")
    private Boolean trusted;

    @OneToMany(mappedBy = "writer", cascade = CascadeType.PERSIST)
    private Set<News> writtenNews = new HashSet<>();

    @OneToMany(mappedBy = "validator", cascade = CascadeType.PERSIST)
    private Set<News> validatedNews = new HashSet<>();

    @OneToMany(mappedBy = "whom", cascade = CascadeType.PERSIST)
    private Set<Review> receivedReviews = new HashSet<>();

    @OneToMany(mappedBy = "writerReview", cascade = CascadeType.PERSIST)
    private Set<Review> writtenReviews = new HashSet<>();

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

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Boolean getTrusted() {
        return trusted;
    }

    public void setTrusted(Boolean trusted) {
        this.trusted = trusted;
    }

    public Set<News> getWrittenNews() {
        return writtenNews;
    }

    public void setWrittenNews(Set<News> writtenNews) {
        this.writtenNews = writtenNews;
    }

    public Set<News> getValidatedNews() {
        return validatedNews;
    }

    public void setValidatedNews(Set<News> validatedNews) {
        this.validatedNews = validatedNews;
    }

    public Set<Review> getReceivedReviews() {
        return receivedReviews;
    }

    public void setReceivedReviews(Set<Review> receivedReviews) {
        this.receivedReviews = receivedReviews;
    }

    public Set<Review> getWrittenReviews() {
        return writtenReviews;
    }

    public void setWrittenReviews(Set<Review> writtenReviews) {
        this.writtenReviews = writtenReviews;
    }
}
