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
    private ReviewType reviewType;

    @ManyToOne
    @JoinColumn(name = "whom_id", insertable = false,updatable = false)
    private User whom;

    @ManyToOne
    @JoinColumn(name = "writer_id", insertable = false,updatable = false)
    private User writerReview;

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

    public Boolean getAnalysed() {
        return analysed;
    }

    public void setAnalysed(Boolean analysed) {
        this.analysed = analysed;
    }

    public Boolean getValidated() {
        return isValidated;
    }

    public void setValidated(Boolean validated) {
        isValidated = validated;
    }

    public ReviewType getReviewType() {
        return reviewType;
    }

    public void setReviewType(ReviewType reviewType) {
        this.reviewType = reviewType;
    }

    public User getWhom() {
        return whom;
    }

    public void setWhom(User whom) {
        this.whom = whom;
    }

    public User getWriterReview() {
        return writerReview;
    }

    public void setWriterReview(User writerReview) {
        this.writerReview = writerReview;
    }
}
