package com.pweb.WarInNewWorld.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pwb_review_types")
public class ReviewType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "review_type_id")
    private Long id;

    @Column(name = "review_type_name")
    private String reviewTypeName;

    @OneToMany(mappedBy = "reviewType", cascade = CascadeType.PERSIST)
    private Set<Review> reviews = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewTypeName() {
        return reviewTypeName;
    }

    public void setReviewTypeName(String reviewTypeName) {
        this.reviewTypeName = reviewTypeName;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }
}
