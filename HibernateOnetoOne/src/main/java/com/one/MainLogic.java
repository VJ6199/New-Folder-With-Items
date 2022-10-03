package com.one;


import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
        SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
        Transaction tx=se.beginTransaction();
        Student Vijay=new Student();
        Vijay.setSid(101);
        Vijay.setSname("Vijay");
        Vijay.setMarks(450);
        
        Address A=new Address();
        A.setAid(201);
        A.setPlace("Hyderabad");
        A.setObj(Vijay);
        se.save(A);

		tx.commit();
	}
}
