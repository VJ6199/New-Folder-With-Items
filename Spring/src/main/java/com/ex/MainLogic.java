package com.ex;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Student vijay=context.getBean(Student.class);
				System.out.println(vijay.getSid()+" "+vijay.getSname()+" "+vijay.getMarks()+" "+vijay.getBranch());
				/*List s = vijay.getCourse();
				Iterator m = s.iterator();
				while(m.hasNext()) {
					System.out.println(m.next());
				}*/

	}

}