package com.proje.repository;

//Book entity'si ile ilgili veriTabanı işlemleri burada yapılacak.

import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactory.jpaFactoryImpl;
import com.proje.model.Book;

public interface BookRepository {

    //esnek bağlantı sağlar, interface classlardan hızlı çalışır ve classın metotlarını interface kullanabilir.
    //bu interface'i implement eden her classta bu factory'e direk erişebilir. (Static ve Final)
    JpaFactory jpaFactory = new jpaFactoryImpl();//

    void save(Book book);

    void delete(Book book);

    Book find(int id);

    Book update(Book newBook);


}
