package com.proje.jpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jpaFactoryImpl implements JpaFactory{

    EntityManager entityManager = null;

    @Override
    public EntityManager getEntityManager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit"); // persistance.xml'deki unit ismi
        entityManager = factory.createEntityManager();

        return entityManager;
    }

    @Override
    public EntityTransaction getEntityTransaction() {

//        EntityTransaction entityTransaction =  this.entityManager.getTransaction();
        return this.entityManager.getTransaction();
    }
}
