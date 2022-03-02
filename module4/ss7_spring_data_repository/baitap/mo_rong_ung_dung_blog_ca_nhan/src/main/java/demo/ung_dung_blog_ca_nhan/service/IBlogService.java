package demo.ung_dung_blog_ca_nhan.service;

import demo.ung_dung_blog_ca_nhan.model.Blog;
import demo.ung_dung_blog_ca_nhan.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(Integer id);

    void deleteById(Integer id);

    Page<Blog> findAllBlogById(Integer id, Pageable pageable);

    Page<Blog> searchByName(String name, Pageable pageable);
}
