package blog_ca_nhan.demo.service;

import blog_ca_nhan.demo.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    List<Blog> findByName(String input_search);
}
