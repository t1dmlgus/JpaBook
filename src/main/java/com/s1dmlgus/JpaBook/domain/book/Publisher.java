package com.s1dmlgus.JpaBook.domain.book;

import com.s1dmlgus.JpaBook.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;



@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Publisher extends BaseTimeEntity {


}
