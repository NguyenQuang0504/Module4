package case_study_module4.repository;

import case_study_module4.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAll(Pageable pageable);
    @Query(value = "select * from customer where customer_name like %?1%", nativeQuery = true)
    List<Customer> findByName(String search);
}
