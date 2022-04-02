package case_study_module4.repository;

import case_study_module4.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    Page<Employee> findAll(Pageable pageable);
    @Query(value = "select * from employee where employee_name like %?1%", nativeQuery = true)
    List<Employee> findByName(String search);
}
