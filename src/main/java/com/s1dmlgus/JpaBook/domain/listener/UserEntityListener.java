package com.s1dmlgus.JpaBook.domain.listener;

import com.s1dmlgus.JpaBook.domain.user.User;
import com.s1dmlgus.JpaBook.domain.user.UserHistory;
import com.s1dmlgus.JpaBook.domain.user.UserHistoryRepository;
import com.s1dmlgus.JpaBook.support.BeanUtils;
import org.springframework.stereotype.Component;

import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;


public class UserEntityListener{

    @PostPersist
    @PostUpdate
    public void prePersistAndPreUpdate(User user){
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);


        UserHistory userHistory = new UserHistory();
        userHistory.setUser(user);
        userHistory.setEmail(user.getEmail());
        userHistory.setName(user.getName());


        userHistoryRepository.save(userHistory);

        System.out.println("2222222222222222222");
    }

}
