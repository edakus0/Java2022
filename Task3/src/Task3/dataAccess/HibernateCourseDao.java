package Task3.dataAccess;

import Task3.entities.Course;

public class HibernateCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("Kurs Hibernate ile veritabanına eklendi.");
	}
}
