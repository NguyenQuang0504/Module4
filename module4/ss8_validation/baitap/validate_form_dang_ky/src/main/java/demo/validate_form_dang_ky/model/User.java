package demo.validate_form_dang_ky.model;

import org.hibernate.annotations.Parent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 5, max = 45, message = "Do dai khong chinh xac")
    private String user;
    @Size(min = 5, max = 15, message = "Mat khau tu 5-15 ky tu")
    private String password;
    @Pattern(regexp = "^[a-zA-Z0-9]{8}.gmail.com$", message = "email khong dung dinh dang")
    private String email;
    @Pattern(regexp = "^0+[0-9]{9}$", message = "So dien thoai sai dinh dang")
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
