package com.proje.repository;

import com.proje.jpaFactory.JpaFactory;
import com.proje.jpaFactory.jpaFactoryImpl;
import com.proje.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BookRepositoryImpl implements BookRepository{

    EntityManager entityManager = jpaFactory.getEntityManager();

    EntityTransaction entityTransaction = jpaFactory.getEntityTransaction();

    @Override
    public void save(Book book) {

        //bir değişiklik olacağı zaman transaction arasına alınmalı

        entityTransaction.begin();

        entityManager.persist(book);

        entityTransaction.commit();

    }

    @Override
    public void delete(Book book) {

        entityTransaction.begin();

        entityManager.remove(book);

        entityTransaction.commit();

    }

    @Override
    public Book find(int id) {

        return this.entityManager.find(Book.class, id);
    }

    @Override
    public Book update(Book newBook) {

        entityTransaction.begin();

        Book updateBook = this.entityManager.merge(newBook);

        entityTransaction.commit();

        return updateBook;
    }
}
