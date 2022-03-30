package case_study_module4.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer position_id;
    private String position_name;

    @OneToMany(mappedBy = "division")
    private List<Employee> employees;

    public Position(Integer position_id, String position_name, List<Employee> employees) {
        this.position_id = position_id;
        this.position_name = position_name;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Position() {
    }

    public Position(Integer position_id, String position_name) {
        this.position_id = position_id;
        this.position_name = position_name;
    }

    public Integer getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }
}
