package exam.demo.controller;

import exam.demo.model.Product;
import exam.demo.model.ProductType;
import exam.demo.service.IProductService;
import exam.demo.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.Bidi;
import java.util.List;

@Controller
@RequestMapping("/product")
public class HomeController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private IProductTypeService iProductTypeService;

    @GetMapping("/display")
    public String display(@PageableDefault(size = 3)Pageable pageable, ModelMap modelMap){
        Page<Product> list = iProductService.findAll(pageable);
        modelMap.addAttribute("listProduct", list);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        iProductService.delete(id);
        return "redirect:/product/display";
    }
    @GetMapping("/create")
    public String create(ModelMap modelMap){
        List<ProductType> typeList = iProductTypeService.findAll();
        modelMap.addAttribute("product", new Product());
        modelMap.addAttribute("productType1", typeList);
        return "create";
    }
    @PostMapping("/save")
    public String save(@Validated @ModelAttribute Product product, BindingResult bindingResult, ModelMap modelMap){
        if (bindingResult.hasFieldErrors()){
            List<ProductType> typeList = iProductTypeService.findAll();
            modelMap.addAttribute("productType1", typeList);
            return "create";
        }
        else {
            iProductService.save(product);
            return "redirect:/product/display";
        }
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id, ModelMap modelMap){
        Product product = iProductService.findById(id);
        modelMap.addAttribute("product", product);
        List<ProductType> typeList = iProductTypeService.findAll();
        modelMap.addAttribute("productType1", typeList);
        return "create";
    }
    @GetMapping("/search")
    public String search(@PageableDefault(size = 3 )Pageable pageable, @RequestParam String search, ModelMap modelMap){
        System.out.println(search);
        Page<Product> productList = iProductService.findByBNane(search, pageable);
        modelMap.addAttribute("listProduct", productList);
        return "list";
    }

}
