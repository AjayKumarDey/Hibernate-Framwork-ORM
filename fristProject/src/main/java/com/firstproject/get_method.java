package com.firstproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class get_method {
public static void main(String[] args) {
	System.out.println("project startedd.....");
	
	Configuration cfg=new Configuration();
	cfg.configure();
	
	SessionFactory factory=cfg.buildSessionFactory();
	
	// GET METHOD
	Session openSession = factory.openSession();
	
	Student student = openSession.get(Student.class, 2);
	System.out.println(student);
	
	
	openSession.close();
	factory.close();
	
}
}
