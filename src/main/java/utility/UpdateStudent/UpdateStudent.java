package utility.UpdateStudent;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.student.Student;

public class UpdateStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student std = em.find(Student.class, 1);
		System.out.println("Before Update" + std.toString());
		et.begin();
		
		std.setFname("KYEYUNE");
		std.setLname("JONATHAN_NANA");
		
		et.commit();
		System.out.println("After Update" + std.toString());
		em.close();
		emf.close();

	}

}
