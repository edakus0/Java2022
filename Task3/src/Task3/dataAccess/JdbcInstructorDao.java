package Task3.dataAccess;

import Task3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Eğitmen JDBC ile veritabanına eklendi.");
	}
}
