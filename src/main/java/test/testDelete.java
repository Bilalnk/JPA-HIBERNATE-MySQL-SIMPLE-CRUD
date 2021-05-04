package test;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repository.BookRepositoryImpl;

public class testDelete {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();

        Book book = bookRepository.find(103);

        try {
            bookRepository.delete(book);

        }catch (Exception e){
            System.out.println("Ürün Bulunamadı");
        }


    }
}
