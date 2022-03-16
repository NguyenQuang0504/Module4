package blog.demo.controller;

import blog.demo.model.Blog;
import blog.demo.model.Category;
import blog.demo.service.IBlogService;
import blog.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;
    // Hien thi danh sach cac category
    @GetMapping("/display/category")
    public ResponseEntity<List<Category>> displayCategory(){
        List<Category> categoryList = iCategoryService.findAll();
        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(categoryList, HttpStatus.OK);
        }
    }
    // Hien thi danh sach blog
    @GetMapping("/display/blog")
    public ResponseEntity<List<Blog>> displayBlog(){
        List<Blog> list = iBlogService.findAll();
        if (list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
    }
    // Tim kiem theo id
    @GetMapping("/display/category/{id}")
    public ResponseEntity<Category> displayCategoryById(@PathVariable Integer id){
        Category category = iCategoryService.findById(id);
        if (category!=null){
        return new ResponseEntity<>(category, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/display/blog/{id}")
    public ResponseEntity<Blog> displayBlogById(@PathVariable Integer id){
        Blog blog = iBlogService.findById(id);
        if (blog!=null) {
            return new ResponseEntity<>(blog, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    //Phuong thuc lay cac blog co
    @GetMapping("/display/blogInCategory/{id}")
    public ResponseEntity<List<Blog>> displayContent(@PathVariable Integer id){
        List<Blog> blog = iBlogService.findContent(id);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
