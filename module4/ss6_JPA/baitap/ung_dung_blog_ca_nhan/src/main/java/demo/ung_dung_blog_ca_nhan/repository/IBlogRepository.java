package demo.ung_dung_blog_ca_nhan.repository;

import demo.ung_dung_blog_ca_nhan.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
}
