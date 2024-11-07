package com.example.UberReviewService.models;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity //will be used for name at the code level
@Table(name = "BookingReview") //represent the name at DB Level
public class Review {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)//this id annotation tells that the id property is a key of our table
    long Id;

    @Column(nullable = false)
    String content;

    Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // this annotation tells spring about the format of Date Object to be stored ie. Date/Time/Timestamp
    @CreatedDate // this annotation tells spring that only handle it for object creation
    Date createdAt;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) //this annoatation tells spring about format of Date Object to be stored
    @LastModifiedDate //this annotation tells spring that only handle for object modification
    Date modifiedAt;
}
