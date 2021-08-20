package com.s1dmlgus.JpaBook.domain.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserHistoryRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserHistoryRepository userHistoryRepository;



    @Test
    public void createUserHistoryRepoTest() throws Exception{
        //given
        //User user01 = new User(1L, "이2", "dmlgus@gmail.com", Gender.MALE);

        //when
        //userRepository.save(user01);

        //then
        userHistoryRepository.findAll().forEach(System.out::println);

    }



}