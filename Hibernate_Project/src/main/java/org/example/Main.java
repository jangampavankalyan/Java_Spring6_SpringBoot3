package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollno(1);
        s1.setsName("Pavan kalyan");
        s1.setsAge(21);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(s1);

        transaction.commit();

        System.out.println(s1);
    }
}