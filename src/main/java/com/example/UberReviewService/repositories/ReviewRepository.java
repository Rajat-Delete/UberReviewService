package com.example.UberReviewService.repositories;

import com.example.UberReviewService.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//if we want to run a file as ssoon as it loads , then we can write code in run method of commandLine Runner
@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
