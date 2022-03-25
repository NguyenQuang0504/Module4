package demo.ung_dung_blog_ca_nhan.controller;

import demo.ung_dung_blog_ca_nhan.model.Blog;
import demo.ung_dung_blog_ca_nhan.model.Category;
import demo.ung_dung_blog_ca_nhan.repository.ICategoryRepository;
import demo.ung_dung_blog_ca_nhan.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class HomeController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @GetMapping("/home")
    public String home(ModelMap modelMap){
        List<Blog> list = iBlogService.findAll();
        modelMap.addAttribute("list", list);
        return "home";
    }
    @GetMapping("/create")
    public String create(ModelMap modelMap){
        modelMap.addAttribute("blog", new Blog());
        List<Category> list = iCategoryRepository.findAll();
        modelMap.addAttribute("listCategory", list);
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog){
        iBlogService.save(blog);
        return "redirect:/category/home";
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
        List<Category> list = iCategoryRepository.findAll();
        modelMap.addAttribute("blog", blog);
        modelMap.addAttribute("list", list);
        return "update";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        iBlogService.deleteById(id);
        return "redirect:/category/home";
    }
}
