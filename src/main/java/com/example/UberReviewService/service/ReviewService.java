package com.example.UberReviewService.service;

import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repositories.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;


    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("**************");



//        Review  r = Review.builder()
//                .content("Amazing work place!!")
//                .rating(4.8)
////                .createdAt(new Date())
////                .modifiedAt(new Date())
//                .build();
//        System.out.println(r);
//        reviewRepository.save(r);


        List<Review> reviews = reviewRepository.findAll();
        for(Review rev : reviews){
            System.out.println("code here");
            System.out.println(rev.getId());
        }
    }
}
