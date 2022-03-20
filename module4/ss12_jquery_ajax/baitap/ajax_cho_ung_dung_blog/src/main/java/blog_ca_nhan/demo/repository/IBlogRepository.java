package blog_ca_nhan.demo.repository;

import blog_ca_nhan.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog where topic like %?1% ", nativeQuery = true)
    List<Blog> findByInput(String input_search);
}
