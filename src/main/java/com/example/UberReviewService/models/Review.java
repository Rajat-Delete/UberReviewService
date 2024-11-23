package com.example.UberReviewService.models;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity //will be used for name at the code level
@Table(name = "BookingReview") //represent the name at DB Level
@Inheritance(strategy =InheritanceType.JOINED)
public class Review extends BaseModel{

    @Column(nullable = false)
    String content;

    Double rating;

//    @Column(nullable = false)
//    @Temporal(TemporalType.TIMESTAMP) // this annotation tells spring about the format of Date Object to be stored ie. Date/Time/Timestamp
//    @CreatedDate // this annotation tells spring that only handle it for object creation
//    Date createdAt;
//
//
//    @Column(nullable = false)
//    @Temporal(TemporalType.TIMESTAMP) //this annoatation tells spring about format of Date Object to be stored
//    @LastModifiedDate //this annotation tells spring that only handle for object modification
//    Date modifiedAt;

    @Override
    public String toString() {
        return "Review{" +
                "Id=" + this.Id +
                ", content='" + this.content + '\'' +
                ", rating=" + this.rating +
                ", createdAt=" + this.createdAt +
                ", modifiedAt=" + this.modifiedAt +
                '}';
    }
}
