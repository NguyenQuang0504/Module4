package demo.ung_dung_quan_ly_khach_hang.repository;

import demo.ung_dung_quan_ly_khach_hang.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
}
