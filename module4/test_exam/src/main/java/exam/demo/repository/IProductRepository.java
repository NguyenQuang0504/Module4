package exam.demo.repository;

import exam.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "select * from product where `name` like %?1%", nativeQuery = true)
    Page<Product> findByName(String name, Pageable pageable);
    @Query(value = "select * from product where `name` like %?1%", nativeQuery = true)
    List<Product> findByName1(String name);
}
