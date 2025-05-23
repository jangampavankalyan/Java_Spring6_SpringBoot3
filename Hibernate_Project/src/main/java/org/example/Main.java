package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.get(Laptop.class,1);
        System.out.println(l1);
//        Laptop l2 = session.get(Laptop.class,1);
//        System.out.println(l2);

        session.close();

        Session session1 = sf.openSession();

        Laptop l2 = session1.get(Laptop.class,1);
        System.out.println(l2);
        session1.close();
        sf.close();

    }
}