package utility.createStudent;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.student.Student;

public class CreateStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Student std = new Student();
		std.setFname("KYEYUNE");
		std.setLname("JONATHAN");
		
		em.persist(std);
		et.commit();
		
		em.close();
		emf.close();

	}

}
