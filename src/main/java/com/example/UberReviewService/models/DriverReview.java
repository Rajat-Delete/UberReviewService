package com.example.UberReviewService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "driverReviewId")
public class DriverReview extends Review{
    private String driverReviewComment;
}
