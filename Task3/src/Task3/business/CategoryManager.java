package Task3.business;

import Task3.core.logging.Logger;
import Task3.dataAccess.CategoryDao;
import Task3.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		if(category.getName().equals(category.getName())) {
			throw new Exception("Bu kategori ismi zaten mevcut. Kategori ismi tekrar edemez.");
		}

		categoryDao.add(category);
		
		for(Logger logger : loggers ) {
			logger.log(category.getName());
		}
	}
}
