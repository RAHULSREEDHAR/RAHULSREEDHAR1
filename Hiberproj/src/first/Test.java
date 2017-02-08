package first; 
  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class Test {  
public static void main(String[] args) {  
      
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");
      
    SessionFactory factory=cfg.buildSessionFactory();  
      
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();  
          
    product p=new product();  
   p.setProductid("1012");
   p.setProductname("chairs");
      p.setProductprice("2000");
      session.save(p);
    t.commit(); 
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  