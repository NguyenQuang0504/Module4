package case_study_module4.controller;

import case_study_module4.model.*;
import case_study_module4.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService iContractService;
    @Autowired
    private IAttachServiceService iAttachServiceService;
    @Autowired
    private IContractDetailService iContractDetailService;
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private IServiceService iServiceService;
    @GetMapping("/home")
    public String display(@PageableDefault(size = 7)Pageable pageable, ModelMap modelMap){
        Page<Contract> list = iContractService.findAll(pageable);
        modelMap.addAttribute("listContract", list);
        return "contract/home";
    }
    @GetMapping("/create")
    public String ceateNewContract(ModelMap modelMap){
        modelMap.addAttribute("contract", new Contract());
        List<Employee> list = iEmployeeService.findAll();
        List<Customer> customerList = iCustomerService.findAll();
        List<Service> serviceList = iServiceService.findAll1();
        modelMap.addAttribute("employee", list);
        modelMap.addAttribute("customer", customerList);
        modelMap.addAttribute("service", serviceList);
        return "contract/create";
    }
    @PostMapping("/save")
    public String saveContract(@ModelAttribute Contract contract){
        iContractService.save(contract);
        return "redirect:/contract/home";
    }
    @GetMapping("/contractDetail")
    public String createContractDetail(ModelMap modelMap){
        List<Contract> contractList = iContractService.findAll();
        List<AttachService> attachServiceList = iAttachServiceService.findAll();
        modelMap.addAttribute("listContract",contractList);
        modelMap.addAttribute("listAttachService", attachServiceList);
        modelMap.addAttribute("contractDetail", new ContractDetail());
        return "contract/create_contract_detail";
    }
    @PostMapping("/saveContractDetail")
    public String saveContractDetail(@ModelAttribute ContractDetail contractDetail){
        iContractDetailService.save(contractDetail);
        return "redirect:/contract/home";
    }
}
