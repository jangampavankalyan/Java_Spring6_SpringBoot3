package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        StudentModel s1 = new StudentModel();
        s1.setRollno(1);
        s1.setsName("Pavan kalyan");
        s1.setsAge(22);

        StudentModel s2 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(StudentModel.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        s2 = session.get(StudentModel.class,1);
        Transaction transaction = session.beginTransaction();

        //session.persist(s1);

//        session.merge(s1);

//        session.remove(s2);

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(s1);
    }
}