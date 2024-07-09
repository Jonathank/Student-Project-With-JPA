package utility.FindStudent;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.student.Student;

public class FindStudent {

	public static void main(String [] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_PU");
		EntityManager em = emf.createEntityManager();
		
		Student std = em.find(Student.class, 1);
		
		if(std != null) {
			System.out.println(std.toString());
		}
	}
}
