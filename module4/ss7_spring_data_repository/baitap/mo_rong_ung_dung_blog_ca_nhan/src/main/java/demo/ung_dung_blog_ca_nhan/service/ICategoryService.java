package demo.ung_dung_blog_ca_nhan.service;

import demo.ung_dung_blog_ca_nhan.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService {
    Page<Category> findAll(Pageable pageable);

    void save(Category category);

    void deleteById(Integer id);
}
