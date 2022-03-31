package case_study_module4.controller;

import case_study_module4.model.Employee;
import case_study_module4.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeControllerRest {
    @Autowired
    private IEmployeeService iEmployeeService;
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee> delete(@PathVariable Integer id){
        Optional<Employee> employeeOptional = iEmployeeService.findById(id);
        if (!employeeOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iEmployeeService.remove(id);
        return new ResponseEntity<>(employeeOptional.get(), HttpStatus.NO_CONTENT);
    }
    @GetMapping("/employee/search")
    public ResponseEntity<List<Employee>> search(String Name){
        List<Employee> employees = iEmployeeService.findByName(Name);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
