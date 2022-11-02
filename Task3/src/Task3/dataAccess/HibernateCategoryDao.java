package Task3.dataAccess;

import Task3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("Kategori Hibernate ile veritabanına eklendi.");
	}
}
