package oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	 Configuration cfg=new Configuration();
     cfg.configure("hibernate.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      
      Question q=new Question();
     
      
      q.setQuestionid(154);
      q.setQuestion("what is java ");
      Answer a=new Answer();
      a.setAnswerid(76);
      a.setAnswer("java is a programming language");
      a.setQuestion(q);
     
      
      Answer a2=new Answer();
      a2.setAnswerid(31);
      a2.setAnswer("java is a oop language");
     a2.setQuestion(q);
      
      Answer a3=new Answer();
      a3.setAnswerid(43);
      a3.setAnswer("java is a platform independent");
    a3.setQuestion(q);
      
      
      List<Answer> list=new ArrayList();
      list.add(a);
      list.add(a2);
      list.add(a3);
      
      q.setAnswers(list);
      
      Session openSession = factory.openSession();
      Transaction tx = openSession.beginTransaction();
      
      openSession.save(q);
   openSession.save(a);
      openSession.save(a2);
      openSession.save(a3);
      
     
      
     
      tx.commit();
      openSession.close();
      factory.close();
      
      
     
     
      
      
}
}
