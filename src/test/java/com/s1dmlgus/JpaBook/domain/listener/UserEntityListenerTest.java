package com.s1dmlgus.JpaBook.domain.listener;

import com.s1dmlgus.JpaBook.domain.user.Gender;
import com.s1dmlgus.JpaBook.domain.user.User;
import com.s1dmlgus.JpaBook.domain.user.UserHistoryRepository;
import com.s1dmlgus.JpaBook.domain.user.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserEntityListenerTest {

    @Autowired
    public UserRepository userRepository;
    @Autowired
    public UserHistoryRepository userHistoryRepository;

    @DisplayName("유저 생성 시 유저 히스토리도 생성한다.")
    @Test
    public void setUserHistory() throws Exception{
        //given
        User user01 = User.builder()
                .name("이의현")
                .email("dmlgusgngl@gmail.com")
                .gender(Gender.MALE)
                .build();

        //when
        userRepository.save(user01);
        
        //then
        userHistoryRepository.findAll().forEach(System.out::println);


    }

}