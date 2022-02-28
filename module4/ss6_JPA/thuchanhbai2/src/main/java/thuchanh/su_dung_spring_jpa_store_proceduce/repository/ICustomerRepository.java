package thuchanh.su_dung_spring_jpa_store_proceduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thuchanh.su_dung_spring_jpa_store_proceduce.model.Customer;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "CALL Insert_Customer(?1,?2,?3);", nativeQuery = true)
    public void saveByStoreProceduce(String address, String cmnd, String name);
}
