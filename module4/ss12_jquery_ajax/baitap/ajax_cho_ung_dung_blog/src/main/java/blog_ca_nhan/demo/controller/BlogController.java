package blog_ca_nhan.demo.controller;

import blog_ca_nhan.demo.model.Blog;
import blog_ca_nhan.demo.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @GetMapping("/")
    public ResponseEntity<List<Blog>> getList(){
        List<Blog> blogList =  iBlogService.findAll();
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
    @GetMapping("/list")
    public ModelAndView getList1(){
        return new ModelAndView("home", "listBlog", iBlogService.findAll());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Blog>> returnList(String Name ){
        List<Blog> list = iBlogService.findByName(Name);
        if (list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
