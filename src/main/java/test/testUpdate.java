package test;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.BookRepositoryImpl;

public class testUpdate {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();

        Book book = bookRepository.find(100);

        book.setTopic("Bilim");

        bookRepository.update(book);

    }
}
