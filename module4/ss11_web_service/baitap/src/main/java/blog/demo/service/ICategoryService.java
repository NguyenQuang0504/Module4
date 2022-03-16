package blog.demo.service;

import blog.demo.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(Integer id);
}
