package demo.ung_dung_blog_ca_nhan.controller;

import demo.ung_dung_blog_ca_nhan.model.Blog;
import demo.ung_dung_blog_ca_nhan.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Blob;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/home")
    public String home(ModelMap modelMap){
        List<Blog> list = iBlogService.findAll();
        modelMap.addAttribute("list", list);
        return "home";
    }
    @GetMapping("/create")
    public String create(ModelMap modelMap){
        modelMap.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog){
        iBlogService.save(blog);
        return "redirect:/home";
    }
    @GetMapping("/view/{id}")
    public String view(@PathVariable Integer id, ModelMap modelMap){
        Blog blog = iBlogService.findById(id);
        modelMap.addAttribute("blog", blog);
        return "display";
    }
    @GetMapping("update/{id}")
    public String update(@PathVariable Integer id, ModelMap modelMap){
        Blog blog = iBlogService.findById(id);
        modelMap.addAttribute("blog", blog);
        return "update";
    }
}
