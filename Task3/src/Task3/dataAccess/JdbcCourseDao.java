package Task3.dataAccess;

import Task3.entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Kurs JDBC ile veritabanına eklendi.");
	}
}