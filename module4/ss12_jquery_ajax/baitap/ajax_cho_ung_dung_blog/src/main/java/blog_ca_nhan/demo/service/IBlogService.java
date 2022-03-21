package blog_ca_nhan.demo.service;

import blog_ca_nhan.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    List<Blog> findByName(String input_search);

    List<Blog> selectLimit(Integer id);
}
