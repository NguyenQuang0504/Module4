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
    @Query(value = "select * from customer inner join contract on customer.customer_id=contract.customer_id inner join contract_detail on contract_detail.contract_id=contract.contract_id inner join attach_service on attach_service.attach_service_id=contract_detail.attach_service_id group by contract.contract_id", nativeQuery = true)
    Page<Customer> find(Pageable pageable);
}
