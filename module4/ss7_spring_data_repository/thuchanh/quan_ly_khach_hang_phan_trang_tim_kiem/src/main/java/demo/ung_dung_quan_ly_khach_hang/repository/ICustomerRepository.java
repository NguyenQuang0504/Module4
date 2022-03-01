package demo.ung_dung_quan_ly_khach_hang.repository;

import demo.ung_dung_quan_ly_khach_hang.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAll(Pageable pageable);

    @Query(value = "select * from customer where nameCustomer like %?1%", nativeQuery = true)
    Page<Customer> search(String name, Pageable pageable);
}
