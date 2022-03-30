package case_study_module4.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer division_id;
    private String division_name;

    @OneToMany(mappedBy = "division")
     private List<Employee> employees;

    public Division(Integer division_id, String division_name, List<Employee> employees) {
        this.division_id = division_id;
        this.division_name = division_name;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Division() {
    }

    public Division(Integer division_id, String division_name) {
        this.division_id = division_id;
        this.division_name = division_name;
    }

    public Integer getDivision_id() {
        return division_id;
    }

    public void setDivision_id(Integer division_id) {
        this.division_id = division_id;
    }

    public String getDivision_name() {
        return division_name;
    }

    public void setDivision_name(String division_name) {
        this.division_name = division_name;
    }
}
