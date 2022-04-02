package case_study_module4.model;

import javax.persistence.*;

@Entity
@Table(name = "USER_ROLE", uniqueConstraints = @UniqueConstraint(name = "USER_ROLE_UK", columnNames = {"Role_Id", "User_Id"}))
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_Role_Id", nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "Role_Id", nullable = false)
    private Role role;
    @ManyToOne
    @JoinColumn(name = "User_Id", nullable = false)
    private User user;

    public Integer getId() {
        return id;
    }

    public UserRole() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserRole(Integer id, Role role, User user) {
        this.id = id;
        this.role = role;
        this.user = user;
    }
}
