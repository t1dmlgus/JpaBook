package com.s1dmlgus.JpaBook.domain.book;

import com.s1dmlgus.JpaBook.domain.BaseTimeEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Book extends BaseTimeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long author_id;

    private Long publisher_id;
}

