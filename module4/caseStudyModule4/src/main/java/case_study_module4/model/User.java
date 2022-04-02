package case_study_module4.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user",uniqueConstraints = @UniqueConstraint(name = "USER_UK", columnNames = "User_Name"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_Id", nullable = false)
    private Integer id_user;
    @Column(name = "User_Name", nullable = false)
    private String user_name;
    @Column(name = "Password", nullable = false)
    private String password;
    @Column(name = "Enable", nullable = false)
    private Boolean enable;

    public User(Integer id_user, String user_name, String password, Boolean enable, List<Employee> employees, List<UserRole> userRoles) {
        this.id_user = id_user;
        this.user_name = user_name;
        this.password = password;
        this.enable = enable;
        this.employees = employees;
        this.userRoles = userRoles;
    }
    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<Employee> employees;
    @OneToMany(mappedBy = "user")
    private List<UserRole> userRoles;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public User() {
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
