package blog.demo.service;

import blog.demo.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(Integer id);

//    Blog findContent(Integer id);
}
