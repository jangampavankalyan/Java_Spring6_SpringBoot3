package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Laptop lap = new Laptop();
        lap.setBrand("Asus");
        lap.setModel("Rog");
        lap.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Pavan Kalyan");
        a1.setTech("Java");
        a1.setLaptop(lap);

       SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

        Alien a2 = session.get(Alien.class,101);

        session.close();
        sf.close();

        System.out.println(a2);

    }
}