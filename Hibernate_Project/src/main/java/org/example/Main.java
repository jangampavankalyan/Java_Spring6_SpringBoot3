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

//        Laptop laptop = session.get(Laptop.class,1);
//        System.out.println(laptop);
//
//        Laptop laptop = session.load(Laptop.class,1);
//        System.out.println(laptop);

        Laptop laptop = session.byId(Laptop.class).getReference(1);
//        System.out.println(laptop);

        session.close();
        sf.close();

    }
}