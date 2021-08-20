package com.s1dmlgus.JpaBook.domain.book;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;


@SpringBootTest
class BookReviewInfoRepositoryTest {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookReviewInfoRepository bookReviewInfoRepository;


    @DisplayName("책 리뷰 생성 테스트")
    @Test
    public void createTest() throws Exception{
        //given
        givenBookReviewInfo();

        //when
        BookReviewInfo save = bookReviewInfoRepository.save(givenBookReviewInfo());

        //then
        assertThat(save.getBook().getName()).isEqualTo("jpa");

    }

    private BookReviewInfo givenBookReviewInfo() {
        return BookReviewInfo.builder()
                .averageReviewScore(4.5f)
                .reviewCount(2)
                .book(givenBook())
                .build();
    }

    private Book givenBook() {
        Book book01 = Book.builder()
                .authorId(1L)
                .name("jpa")
                .publisherId(1L)
                .build();

        return bookRepository.save(book01);
    }

    @DisplayName("연관관계-getBook")
    @Test
    public void readTest() throws Exception{
        //given
        BookReviewInfo saveBookReviewInfo = bookReviewInfoRepository.save(givenBookReviewInfo());

        //when
        Book findBook = bookReviewInfoRepository
                .findById(1L)
                .orElseThrow(RuntimeException::new)
                .getBook();

        //System.out.println("saveBookReviewInfo = " + saveBookReviewInfo);
        System.out.println("findBook = " + findBook);


        //then
        assertThat(findBook.getName()).isEqualTo("jpa");
    }

}