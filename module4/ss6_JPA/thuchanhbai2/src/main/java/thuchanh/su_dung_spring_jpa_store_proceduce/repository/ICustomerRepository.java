package thuchanh.su_dung_spring_jpa_store_proceduce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import thuchanh.su_dung_spring_jpa_store_proceduce.model.Customer;

import javax.transaction.Transactional;
import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    @Transactional // transactional
    @Modifying // Danh dau day la mot cau thay doi
    @Query(value = "CALL Insert_Customer(?1,?2,?3);", nativeQuery = true)
    public void saveByStoreProceduce(String address, String cmnd, String name);
    @Transactional
    @Query(value = "select * from customer where name like %?1% ", nativeQuery = true)
    List<Customer> findName(String search);
}
