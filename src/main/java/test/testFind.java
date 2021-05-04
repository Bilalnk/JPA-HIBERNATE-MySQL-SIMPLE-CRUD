package test;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.BookRepositoryImpl;

public class testFind {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();

        Book book = bookRepository.find(101);

        if(book != null){
            System.out.println(book.toString());
        }else{
            System.out.println(book);
        }



    }
}
