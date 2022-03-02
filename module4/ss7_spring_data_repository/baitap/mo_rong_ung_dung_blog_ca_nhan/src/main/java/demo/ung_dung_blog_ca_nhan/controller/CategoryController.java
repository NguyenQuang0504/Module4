package demo.ung_dung_blog_ca_nhan.controller;

import demo.ung_dung_blog_ca_nhan.model.Blog;
import demo.ung_dung_blog_ca_nhan.model.Category;
import demo.ung_dung_blog_ca_nhan.service.IBlogService;
import demo.ung_dung_blog_ca_nhan.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/category")
@Controller
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/home")
    public String home(@PageableDefault(size = 3) Pageable pageable, ModelMap modelMap){
        Page<Category> list = iCategoryService.findAll(pageable);
        modelMap.addAttribute("listCategory", list);
        return "home_category";
    }
    @GetMapping("/create")
    public String create(ModelMap modelMap){
        modelMap.addAttribute("category", new Category());
        return "create_category";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Category category){
        iCategoryService.save(category);
        return "redirect:/category/home";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        iCategoryService.deleteById(id);
        return "redirect:/category/home";
    }
    @GetMapping("/view/{id}")
    public String viewList(@PageableDefault(size = 3) Pageable pageable,@PathVariable Integer id, ModelMap modelMap){
        Page<Blog> listBlog = iBlogService.findAllBlogById(id, pageable);
        modelMap.addAttribute("list", listBlog);
        modelMap.addAttribute("id", id);
        return "display_list";
    }
    @GetMapping("/search")
    public String search(@PageableDefault(size = 3) Pageable pageable,@RequestParam String name, ModelMap modelMap){
        Page<Blog> list = iBlogService.searchByName(name, pageable);
        modelMap.addAttribute("list", list);
        modelMap.addAttribute("name", name);
        return "list_blog";
    }
}
