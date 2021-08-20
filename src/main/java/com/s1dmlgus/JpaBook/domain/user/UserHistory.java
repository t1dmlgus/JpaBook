package com.s1dmlgus.JpaBook.domain.user;

import com.s1dmlgus.JpaBook.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;



@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
