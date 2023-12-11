package com.project.booksearchservice.service

import com.project.booksearchservice.data.Book
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BookServiceTest {

    private val bookService: BookService = BookService()
    @Test
    fun getBookById() {
        println("testtest")
        val book = bookService.getBookById(2)
        println("=-------------------testtest:" + book)
    }
}