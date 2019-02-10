package com.project.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        /**
         * SessionFactory is an interface. SessionFactory can be created by providing Configuration object, which will contain all DB related property details pulled from either hibernate.cfg.xml file or hibernate.properties file. SessionFactory is a factory for Session objects.
         *
         * We can create one SessionFactory implementation per database in any application. If your application is referring to multiple databases, then you need to create one SessionFactory per database.
         *
         * The SessionFactory is a heavyweight object; it is usually created during application start up and kept for later use. The SessionFactory is a thread safe object and used by all the threads of an application.
         */
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        /**
         * The lifecycle of a Session is bounded by the beginning and end of a logical transaction. (Long transactions might span several database transactions.)
         *
         * The main function of the Session is to offer create, read and delete operations for instances of mapped entity classes. Instances may exist in one of three states:
         *
         * transient: never persistent, not associated with any Session
         * persistent: associated with a unique Session
         * detached: previously persistent, not associated with any Session
         *
         * Transient instances may be made persistent by calling save(), persist() or saveOrUpdate(). Persistent instances may be made transie
         */


        /**
         * openSession() vs getCurrentSession()
         * Il metodo openSession() crea una nuova sessione ma richiede la chiusura manuale della stessa con close().
         * Il metodo getCurrentSession() invece crea una nuova sessione se non ne esiste già una, ed inoltre, a differenza
         * di openSession(), non richiede la chiusura manuale della sessione --> viene chiusa al termine della transaction.
         */
        Session session = factory.getCurrentSession();

        try{

            Student myStudent = new Student("Fabrizio", "D'Ascenzo", "bigfabbro93@gmail.com");

            session.beginTransaction();

            session.save(myStudent);

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
