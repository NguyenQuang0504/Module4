package case_study_module4.controller;

import case_study_module4.model.Division;
import case_study_module4.model.Education;
import case_study_module4.model.Employee;
import case_study_module4.model.Position;
import case_study_module4.service.IDivisionService;
import case_study_module4.service.IEducationService;
import case_study_module4.service.IEmployeeService;
import case_study_module4.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @Autowired
    private IPositionService iPositionService;

    @Autowired
    private IDivisionService iDivisionService;

    @Autowired
    private IEducationService iEducationService;

    @GetMapping("/home")
    public String displayEmployee(@PageableDefault(size = 7)Pageable pageable, ModelMap modelMap){
        Page<Employee> employeeList = iEmployeeService.findAll(pageable);
        modelMap.addAttribute("listEmployee", employeeList);
        return "employee/home";
    }
    @GetMapping("/create")
    public String createEmployee(ModelMap modelMap){
        modelMap.addAttribute("employee", new Employee());
        List<Position> positionList = iPositionService.findAll();
        List<Division> divisionList = iDivisionService.findAll();
        List<Education> educationList = iEducationService.findAll();
        modelMap.addAttribute("listDivision", divisionList);
        modelMap.addAttribute("listPosition", positionList);
        modelMap.addAttribute("listEducation", educationList);
        return "employee/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Employee employee, ModelMap modelMap){
        iEmployeeService.save(employee);
        return "redirect:/employee/home";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id, ModelMap modelMap){
        Optional<Employee> listEmployee = iEmployeeService.findById(id);
        modelMap.addAttribute("employee", listEmployee.get());
        List<Position> positionList = iPositionService.findAll();
        List<Division> divisionList = iDivisionService.findAll();
        List<Education> educationList = iEducationService.findAll();
        modelMap.addAttribute("listDivision", divisionList);
        modelMap.addAttribute("listPosition", positionList);
        modelMap.addAttribute("listEducation", educationList);
        return "employee/update";
    }
    @GetMapping("/search")
    public String search(@PageableDefault(size = 7)Pageable pageable,@RequestParam String search, ModelMap modelMap){
        Page<Employee> listEmployee = iEmployeeService.findByName(search, pageable);
        modelMap.addAttribute("listEmployee", listEmployee);
        return "employee/home";
    }
}
