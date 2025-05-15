package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("XPS");
        l2.setRam(32);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Pavan Kalyan");
        a1.setTech("Java");
        a1.setLaptops(Arrays.asList(l1,l2));

        l1.setAlien(a1);
        l2.setAlien(a1);

       SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
               .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(a1);

        transaction.commit();

        Alien a2 = session.get(Alien.class,101);

        session.close();
        sf.close();

        System.out.println(a2);

    }
}