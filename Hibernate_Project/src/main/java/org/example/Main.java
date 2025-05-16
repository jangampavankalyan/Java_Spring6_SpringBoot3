package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

//        Query query = session.createQuery("from Laptop where ram=32");

        String brand = "Asus";
//        Query query = session.createQuery("from Laptop where brand like ?1");
//        query.setParameter(1,brand);
//        List<Laptop> laptops = query.getResultList();


        Query query = session.createQuery("select brand,model from Laptop where brand like ?1");
        query.setParameter(1,brand);
        List<Object[]> laptops = query.getResultList();

        for(Object[] data : laptops){
            System.out.println((String) data[0] + " " + (String) data[1]);
        }


//        Laptop l1 = session.get(Laptop.class,1);

//        System.out.println(l1);

        System.out.println(laptops);

        session.close();
        sf.close();

    }
}