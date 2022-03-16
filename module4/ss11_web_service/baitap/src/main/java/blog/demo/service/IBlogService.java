package blog.demo.service;

import blog.demo.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(Integer id);

    List<Blog> findContent(Integer id);

//    Blog findContent(Integer id);
}
