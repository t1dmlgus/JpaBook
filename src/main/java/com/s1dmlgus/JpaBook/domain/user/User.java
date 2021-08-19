package com.s1dmlgus.JpaBook.domain.user;

import com.s1dmlgus.JpaBook.domain.BaseTimeEntity;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
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


}
