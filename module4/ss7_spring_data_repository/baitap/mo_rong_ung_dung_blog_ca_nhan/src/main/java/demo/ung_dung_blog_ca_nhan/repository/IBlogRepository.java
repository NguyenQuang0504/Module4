package demo.ung_dung_blog_ca_nhan.repository;

import demo.ung_dung_blog_ca_nhan.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = " select * from blog where category_id = ?1", countQuery = "select count(*) from blog where category_id = ?1",nativeQuery = true)
    Page<Blog> findAllBlogById(Integer id, Pageable pageable);

    @Query(value = "select * from blog where topic like %?1%", countQuery = "select count(*) from blog where topic like %?1%", nativeQuery = true)
    Page<Blog> searchByName(String name, Pageable pageable);
}
