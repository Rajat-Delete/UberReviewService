package com.example.UberReviewService.models;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "passengerReviewId")
public class PassengerReview extends Review{
    private String passengerReviewComment;
}
