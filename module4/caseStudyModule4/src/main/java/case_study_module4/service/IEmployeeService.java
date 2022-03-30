package case_study_module4.service;

import case_study_module4.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);

    void save(Employee employee);

    void remove(Integer id);

    Optional<Employee> findById(Integer id);

    Page<Employee> findByName(String search, Pageable pageable);
}
