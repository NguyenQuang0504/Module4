package case_study_module4.controller;

import case_study_module4.model.Customer;
import case_study_module4.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/useService")
public class CustomerUseServiceController {
    @Autowired
    private ICustomerService iCustomerService;
    @GetMapping("/display")
    public String display(@PageableDefault(size = 7)Pageable pageable, ModelMap modelMap){
        Page<Customer> listCustomer = iCustomerService.find(pageable);
        modelMap.addAttribute("listCustomer", listCustomer);
        return "list_customer";
    }
}
