package controllers;

import model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.Impl.IMailBoxService;
import service.MailBoxService;

@Controller
public class HomeController {
    private IMailBoxService iMailBoxService = new MailBoxService();
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("model", new MailBox());
        return "home";
    }
    @PostMapping("/result")
    public String result(@ModelAttribute( name = "model") MailBox mail){
        iMailBoxService.save(mail);
        return "result";
    }
}
