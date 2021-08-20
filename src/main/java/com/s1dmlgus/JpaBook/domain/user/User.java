package com.s1dmlgus.JpaBook.domain.user;

import com.s1dmlgus.JpaBook.domain.BaseTimeEntity;
import com.s1dmlgus.JpaBook.domain.listener.UserEntityListener;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EntityListeners(value = UserEntityListener.class)
@Entity
public class User extends BaseTimeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NonNull
    private String email;


    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    @ToString.Exclude
    private final List<UserHistory> userHistories = new ArrayList<>();



    public void setEmail(String email) {
        this.email = email;
    }
}
