package demo.luu_ten_cookie.model;

public class User {
    private String email;
    private String password;

    public User(String userName, String password) {
        this.email = userName;
        this.password = password;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String userName) {
        this.email = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
