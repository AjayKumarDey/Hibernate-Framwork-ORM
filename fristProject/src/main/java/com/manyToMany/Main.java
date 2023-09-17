package com.manyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	System.out.println("project started....");
	Configuration cfg=new Configuration();
    cfg.configure();
     SessionFactory factory=cfg.buildSessionFactory();
     Employee e1=new Employee();
     Employee e2=new Employee();
     
     e1.setEid(81);
     e1.setEmployeName("Ajay");
     e2.setEid(82);
     e2.setEmployeName("vivek");
     
     Project p1=new Project();
     Project p2=new Project();
     p1.setPid(91);
     p1.setProjectName("Employee Management system");
     p2.setPid(92);
     p2.setProjectName("Crud Operations");
     
     List<Employee> elist =new ArrayList<Employee>();
     List<Project> plist=new ArrayList<Project>();
     elist.add(e1);
     elist.add(e2);
    
     plist.add(p1);
     plist.add(p2);
     
     e1.setProjects(plist);
    
     p2.setEmployees(elist);
     
     
    
     Session openSession = factory.openSession();
     Transaction tx = openSession.beginTransaction();
     openSession.save(e1);
     openSession.save(e2);
     openSession.save(p1);
     openSession.save(p2);
     
     
     
     
     
     tx.commit();
     openSession.close();
     factory.close();
}
}
