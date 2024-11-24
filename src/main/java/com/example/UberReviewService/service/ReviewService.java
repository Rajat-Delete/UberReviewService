package com.example.UberReviewService.service;

import com.example.UberReviewService.models.Booking;
import com.example.UberReviewService.models.BookingStatus;
import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repositories.BookingRepository;
import com.example.UberReviewService.repositories.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    private BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**************");

        //creating the review and booking together
        Review r  = Review.builder().content("Amazing ride with uber").rating(10.0).build();
        Booking b = Booking.builder().review(r).bookingStatus(BookingStatus.SCHEDULED).startTime(new Date()).build();

        bookingRepository.save(b);

        //deleting the Booking
        Optional<Booking> b1 = bookingRepository.findById(552L);

        if(b1.isPresent()){
            bookingRepository.delete(b1.get());
        }

    }
}
