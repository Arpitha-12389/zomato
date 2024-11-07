
   

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hibernate {
public static void main(String[] args) {
	 EntityManagerFactory e=Persistence.createEntityManagerFactory("monday");
	 EntityManager m=e.createEntityManager();
	 EntityTransaction t=m.getTransaction();
	 
	 Hero h=new Hero();
	 h.setsAge(44);
	 h.setsName("Arpitha");
	 h.setsPercentage(22.3);
	 
	 t.begin();
	 m.persist(h);
	 t.commit();
}


}
