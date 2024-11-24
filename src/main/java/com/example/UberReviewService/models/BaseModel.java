package com.example.UberReviewService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel {
    @Id
    @GeneratedValue(generator = "UUID")//this id annotation tells that the id property is a key of our table
    protected long Id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // this annotation tells spring about the format of Date Object to be stored ie. Date/Time/Timestamp
    @CreatedDate // this annotation tells spring that only handle it for object creation
    protected Date createdAt;


    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) //this annoatation tells spring about format of Date Object to be stored
    @LastModifiedDate //this annotation tells spring that only handle for object modification
    protected Date modifiedAt;

}
