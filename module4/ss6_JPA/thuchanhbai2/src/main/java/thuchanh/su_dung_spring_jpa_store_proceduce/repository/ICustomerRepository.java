package thuchanh.su_dung_spring_jpa_store_proceduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thuchanh.su_dung_spring_jpa_store_proceduce.model.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
