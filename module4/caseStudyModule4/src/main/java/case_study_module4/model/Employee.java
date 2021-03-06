package case_study_module4.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    @NotEmpty(message = "Ten khong duoc de trong")
    private String employee_name;
    private String employee_birthday;
    @Pattern(regexp = "^[0-9]{9}|[0-9]{12}$", message = "CMND khong dung dinh dang")
    private String employee_id_card;
    private Double employee_salary;
    private String employee_phone;
    @Pattern(regexp = "^[\\w-\\.]+@(gmail.)+[com]{3,4}$", message = "email khong dung dinh dang")
    private String employee_email;
    @NotEmpty(message = "Dia chi khong duoc de trong nha")
    private String employee_address;

    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree_id", nullable = false)
    private Education education;

    @ManyToOne
    @JoinColumn(name = "division_id", nullable = false)
    private Division division;
    @JsonBackReference
    @OneToMany(mappedBy = "employee")
    private List<Contract> contracts;

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    @ManyToOne
    @JoinColumn(name = "User_Name", nullable = false)
    private User user;

    public Employee(Integer employee_id, @NotEmpty(message = "Ten khong duoc de trong") String employee_name, String employee_birthday, @Pattern(regexp = "^[0-9]{9}|[0-9]{12}$", message = "CMND khong dung dinh dang") String employee_id_card, Double employee_salary, String employee_phone, @Pattern(regexp = "^[\\w-\\.]+@(gmail.)+[com]{3,4}$", message = "email khong dung dinh dang") String employee_email, @NotEmpty(message = "Dia chi khong duoc de trong nha") String employee_address, Position position, Education education, Division division, List<Contract> contracts, User user) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_birthday = employee_birthday;
        this.employee_id_card = employee_id_card;
        this.employee_salary = employee_salary;
        this.employee_phone = employee_phone;
        this.employee_email = employee_email;
        this.employee_address = employee_address;
        this.position = position;
        this.education = education;
        this.division = division;
        this.contracts = contracts;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Employee() {
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(String employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_id_card() {
        return employee_id_card;
    }

    public void setEmployee_id_card(String employee_id_card) {
        this.employee_id_card = employee_id_card;
    }

    public Double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }
}
