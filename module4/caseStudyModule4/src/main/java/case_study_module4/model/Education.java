package case_study_module4.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "education_degree")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer education_degree_id;
    private String education_degree_name;

    @OneToMany(mappedBy = "education")
    private List<Employee> employees;

    public Education(Integer education_degree_id, String education_degree_name, List<Employee> employees) {
        this.education_degree_id = education_degree_id;
        this.education_degree_name = education_degree_name;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Education() {
    }

    public Education(Integer education_degree_id, String education_degree_name) {
        this.education_degree_id = education_degree_id;
        this.education_degree_name = education_degree_name;
    }

    public Integer getEducation_degree_id() {
        return education_degree_id;
    }

    public void setEducation_degree_id(Integer education_degree_id) {
        this.education_degree_id = education_degree_id;
    }

    public String getEducation_degree_name() {
        return education_degree_name;
    }

    public void setEducation_degree_name(String education_degree_name) {
        this.education_degree_name = education_degree_name;
    }
}
