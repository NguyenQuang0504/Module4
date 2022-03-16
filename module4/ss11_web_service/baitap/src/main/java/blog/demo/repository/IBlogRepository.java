package blog.demo.repository;

import blog.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog where blog.id_category = ?1", nativeQuery = true)
    List<Blog> findBlogByIdCategory(Integer id);
//    @Query(value = "select id, content from blog", nativeQuery = true)
//    Blog findContent(Integer id);
}
