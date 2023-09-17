package embeddObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	System.out.println("project started...");
    
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	Children c=new Children();
	c.setMobileno(12334);
	Name n=new Name();
	n.setFirstName("ajay");
	n.setMiddleName("kumar");
	n.setLastName("Dey");
    c.setName(n);
    System.out.println(c);
    System.out.println(n);
    
    Children c2=new Children();
	c2.setMobileno(12134);
	Name n2=new Name();
	n2.setFirstName("vivek ");
	n2.setMiddleName("kumar");
	n2.setLastName("roy");
    c2.setName(n2);
    System.out.println(c2);
    System.out.println(n2);
	
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	session.save(c);
	session.save(c2);
	
	
	tx.commit();
	session.close();
factory.close();
	
	
}
}
