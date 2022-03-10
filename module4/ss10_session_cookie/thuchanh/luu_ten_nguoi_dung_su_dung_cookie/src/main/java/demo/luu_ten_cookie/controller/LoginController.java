package demo.luu_ten_cookie.controller;

import demo.luu_ten_cookie.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("userLogin")
public class LoginController {
    @ModelAttribute("userLogin") //Annotation @SessionAttributes("userLogin") được sử dụng để lưu trữ thông tin của model attribute có tên là userLogin từ view trả về.
    //Phuong thuc sau add User vao model attribute userLogin mà xuống view ko cần gửi xuống nữa
    private User setUser(){
        return new User();
    }

    @RequestMapping("/login")
    public String Index(@CookieValue(value = "setUser", defaultValue = "") String setUser, Model model) {
        Cookie cookie = new Cookie("setUser", setUser); // tạo cookie có giá trị là setUser để truyền xuống view hiển thị, lần đầu thì là cookie rỗng
        model.addAttribute("cookieValue", cookie); // Gửi cookie xuống view và dưới view lấy cookieValue.value để hiển thị, lần đâu thì là rỗng
        return "login";
    }

    @PostMapping("/dologin")
    public String doLogin(@ModelAttribute("userLogin") User user, Model model, @CookieValue(value = "setUser", defaultValue = "") String setUser,
                          HttpServletResponse response, HttpServletRequest request) {
        //implement business logic kiểm tra xem nhập đúng thì lưu vào setUser(cookie)
        if (user.getEmail().equals("admin@gmail.com") && user.getPassword().equals("12345")) {
            if (user.getEmail() != null)
                setUser = user.getEmail();

            // create cookie and set it in response
            Cookie cookie = new Cookie("setUser", setUser); // Tạo cookie mới và có giá trị là gmail nhập đúng
            cookie.setMaxAge(60);
            response.addCookie(cookie); // Gửi cookie về và lưu vào 60s

            //get all cookies
            Cookie[] cookies = request.getCookies(); // lấy tất cả cookie hiện tại
            //iterate each cookie
            for (Cookie ck : cookies) {
                //display only the cookie with the name 'setUser'
                if (ck.getName().equals("setUser")) { // kiểm tra cookie nào có tên giống cookie tên setUser rooif trả về
                    model.addAttribute("cookieValue", ck);
                    break;
                } else {
                    ck.setValue("");
                    model.addAttribute("cookieValue", ck);
                    break;
                }
            }
            model.addAttribute("message", "Login success. Welcome ");
        } else {
            user.setEmail("");
            Cookie cookie = new Cookie("setUser", setUser);
            model.addAttribute("cookieValue", cookie);
            model.addAttribute("message", "Login failed. Try again.");
        }
        return "login";
    }
}
