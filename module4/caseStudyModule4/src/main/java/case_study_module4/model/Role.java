package case_study_module4.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Role", uniqueConstraints = @UniqueConstraint(name = "ROLE_UK", columnNames = "Role_Name"))
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Role_Id", nullable = false)
    private Integer id;
    @Column(name = "Role_Name", nullable = false)
    private String role_name;
    @JsonBackReference
    @OneToMany(mappedBy = "role")
    private List<UserRole> userRoles;

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public Role(Integer id, String role_name, List<UserRole> userRoles) {
        this.id = id;
        this.role_name = role_name;
        this.userRoles = userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
