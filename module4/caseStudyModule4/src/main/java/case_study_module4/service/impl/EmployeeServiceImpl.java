package case_study_module4.service.impl;

import case_study_module4.model.Employee;
import case_study_module4.repository.IEmployeeRepository;
import case_study_module4.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return iEmployeeRepository.findById(id);
    }

    @Override
    public Page<Employee> findByName(String search, Pageable pageable) {
        return iEmployeeRepository.findByName(search, pageable);
    }

    @Override
    public void remove(Integer id) {
        iEmployeeRepository.deleteById(id);
    }
}
