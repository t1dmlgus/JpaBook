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
public class BookReviewInfo extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float averageReviewScore;

    private int reviewCount;

    @OneToOne
    private Book book;



}
