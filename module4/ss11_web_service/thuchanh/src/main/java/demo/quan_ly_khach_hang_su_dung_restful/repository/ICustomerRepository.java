package demo.quan_ly_khach_hang_su_dung_restful.repository;

import demo.quan_ly_khach_hang_su_dung_restful.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select * from customer LIMIT ?2, ?1", nativeQuery = true)
    List<Customer> findAllPage(Integer size, Integer page);
    @Query(value = "select * from customer where (firstName like %?1% and ?2 = 'firstName') or (lastName like %?1% and ?2='lastName') or ((lastName like %?1% or firstName like %?1%) and ?2 = 'fullName')", nativeQuery = true)
    List<Customer> search(String input, String attribute);

}
