package com.s1dmlgus.JpaBook.domain.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookReviewInfoRepository bookReviewInfoRepository;
    @Autowired
    private BookRepository bookRepository;


    @BeforeEach
    public void setUp(){

        //givenBook();
        givenBookReviewInfo();
    }


    private BookReviewInfo givenBookReviewInfo() {
        BookReviewInfo bookReviewInfo = BookReviewInfo.builder()
                .averageReviewScore(4.5f)
                .reviewCount(2)
                .book(givenBook())
                .build();
        return bookReviewInfoRepository.save(bookReviewInfo);

    }

    private Book givenBook() {
        Book book01 = Book.builder()
                .authorId(1L)
                .name("jpB")
                .publisherId(1L)
                .build();

        return bookRepository.save(book01);
    }

    @Test
    public void createBookTest() throws Exception{
        //given

        Book book01 = Book.builder()
                .authorId(1L)
                .name("jpa")
                .publisherId(1L)
                .build();


        //when
        Book saveBook = bookRepository.save(book01);


        //then
        System.out.println("saveBook = " + saveBook);

    }
    

    @DisplayName("")
    @Test
    public void readBookTest() throws Exception{
        //given

        Book book = bookRepository.findById(1L)
                .orElseThrow(RuntimeException::new);

        bookReviewInfoRepository.findAll().forEach(System.out::println);


        //when
        System.out.println("book = " + book);


        //then
    }


    // stackOverFlow 에러
    @DisplayName("책 리뷰 가져오기")
    @Test
    public void getBookReviewInfoTest() throws Exception{
        //given
        
        //when
        BookReviewInfo bookReviewInfo = bookRepository.findById(1L)
                .orElseThrow(RuntimeException::new)
                .getBookReviewInfo();

        System.out.println("bookReviewInfo22 = " + bookReviewInfo);

        //then


    }
    
}