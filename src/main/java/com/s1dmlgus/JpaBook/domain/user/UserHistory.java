package com.s1dmlgus.JpaBook.domain.user;

import com.s1dmlgus.JpaBook.domain.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userHistoryId")
    private Long id;

    private Long userId;

    private String name;

    private String email;
}
