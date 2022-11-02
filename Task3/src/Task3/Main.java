package Task3;

import Task3.business.CategoryManager;
import Task3.business.CourseManager;
import Task3.business.InstructorManager;
import Task3.core.logging.DatabaseLogger;
import Task3.core.logging.FileLogger;
import Task3.core.logging.Logger;
import Task3.core.logging.MailLogger;
import Task3.dataAccess.HibernateCategoryDao;
import Task3.dataAccess.HibernateCourseDao;
import Task3.dataAccess.JdbcInstructorDao;
import Task3.entities.Category;
import Task3.entities.Course;
import Task3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Instructor instructor1 = new Instructor(1, "Eda", "Kuş", 6000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		Course course1 = new Course(1, "İleri Seviye Java Kursu", 500);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		
		Category category1 = new Category(1, "Eğitim");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
	}

}