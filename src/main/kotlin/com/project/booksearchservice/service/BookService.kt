package com.project.booksearchservice.service

import com.project.booksearchservice.data.Book
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class BookService {

    private val books = listOf(
            Book(1, "Book1", "Author1", 19.1),
            Book(2, "Book2", "Author2", 29.0),
            Book(3, "Book3", "Author3", 39.0)
    )

    @Cacheable("bookStore", key = "#bookId")
    fun getBookById(bookId:Int): Book? {
        print("test")
        for (book:Book in books) {
            if(book.bookId == bookId)
            return book
        }
        return null
    }

}