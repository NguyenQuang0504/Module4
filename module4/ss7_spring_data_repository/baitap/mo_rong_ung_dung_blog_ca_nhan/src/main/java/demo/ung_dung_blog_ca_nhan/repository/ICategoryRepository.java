package demo.ung_dung_blog_ca_nhan.repository;

import demo.ung_dung_blog_ca_nhan.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {

    Page<Category> findAll(Pageable pageable);
}
