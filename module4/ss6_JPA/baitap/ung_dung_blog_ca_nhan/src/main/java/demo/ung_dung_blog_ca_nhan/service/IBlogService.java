package demo.ung_dung_blog_ca_nhan.service;

import demo.ung_dung_blog_ca_nhan.model.Blog;
import demo.ung_dung_blog_ca_nhan.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(Integer id);

}
