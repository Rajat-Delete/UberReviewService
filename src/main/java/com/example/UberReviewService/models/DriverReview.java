package com.example.UberReviewService.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class DriverReview extends Review{
    private String driverReviewComment;
}