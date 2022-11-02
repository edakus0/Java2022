package Task3.dataAccess;

import Task3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veritabanına eklendi.");
	}
}
