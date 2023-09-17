package com.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	  Configuration cfg=new Configuration();
      cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       
       Question q1=new Question();
      q1.setQuestionid(123);
      q1.setQuestion("what is ORM");
      
      Answer a1=new Answer();
      a1.setAnswerid(321);
      a1.setAnswer("ORM is Object relation mapping");
      q1.setAnswer(a1);
      
      Session openSession = factory.openSession();
      Transaction tx = openSession.beginTransaction();
      
      openSession.save(q1);
      openSession.save(a1);
      
      tx.commit(); 
      openSession.close();
     
      factory.close();
      
}
}
