package com.s1dmlgus.JpaBook.domain.listener;

import com.s1dmlgus.JpaBook.domain.user.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
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

        user01.setEmail("t1@gmail.com");
        userRepository.save(user01);


        //then
        userHistoryRepository.findByUserId(user01.getId()).forEach(System.out::println);



        User user = userRepository.findById(1L).get();
        //List<UserHistory> userHistories = userRepository.findById(1L).get().getUserHistories();
        //System.out.println("userHistories = " + userHistories);


        System.out.println("user22 = " + user);
        assertThat(userHistoryRepository.existsById(2L)).isTrue();

    }

}