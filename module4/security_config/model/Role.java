package demo.ung_dung_blog_ca_nhan.model;

import javax.persistence.*;

@Entity
@Table(name = "Role",
    uniqueConstraints = @UniqueConstraint(name = "ROLE_UK", columnNames = "Role_Name"))
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Role_Id", nullable = false)
    private Integer id;
    @Column(name = "Role_Name", nullable = false)
    private String roleName;

    public Role() {
    }

    public Role(Integer id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
