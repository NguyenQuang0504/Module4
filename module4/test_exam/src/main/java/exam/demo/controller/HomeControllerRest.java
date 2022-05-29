package exam.demo.controller;

import exam.demo.model.Product;
import exam.demo.service.IProductService;
import exam.demo.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productRest")
public class HomeControllerRest {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private IProductTypeService iProductTypeService;
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Product> delete(@PathVariable Integer id){
        System.out.println(id);
        Product product = iProductService.findById(id);
        if (product==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iProductService.delete(id);
        return  new ResponseEntity<>(product, HttpStatus.NO_CONTENT);
    }
    @GetMapping("/search/{name}")
    public ResponseEntity<List<Product>> search(@PathVariable String name){
        System.out.println(name);
        List<Product> list = iProductService.findByBName(name);
        if (list.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
