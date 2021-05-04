package test;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.BookRepositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.Date;

public class test {

    public static void main(String[] args) {

        Book book = new Book();
        book.setBookId(100);
        book.setName("Zamanın Kısa Tarihi");
        book.setAuthor("Stephen Hawking");
        book.setPageCount(255);
        book.setTopic("Popüler Bilim");
        book.setPublisherDate(createCustomDate(3, 12,2020));


        Book book2 = new Book();
        book2.setBookId(101);
        book2.setName("Kaplan! Kaplan!");
        book2.setAuthor("Alfred Bester");
        book2.setPageCount(304);
        book2.setTopic("BilimKurgu-Fantazi");
        book2.setPublisherDate(createCustomDate(3, 12,2020));

        Book book3 = new Book(103, "new Book", 152, "science fiction", "Handsome Author", createCustomDate(5,7,2008));

        BookRepository bookRepository = new BookRepositoryImpl();
        bookRepository.save(book);
        bookRepository.save(book2);
        bookRepository.save(book3);

    }

    public static Date createCustomDate(int day, int month, int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);

        return calendar.getTime();
    }
}
