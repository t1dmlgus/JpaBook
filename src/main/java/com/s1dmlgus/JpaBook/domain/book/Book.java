package com.s1dmlgus.JpaBook.domain.book;

import com.s1dmlgus.JpaBook.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;


@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Book extends BaseTimeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long authorId;

    private Long publisherId;


    @OneToOne(mappedBy = "book")
    @ToString.Exclude
    private BookReviewInfo bookReviewInfo;
}

