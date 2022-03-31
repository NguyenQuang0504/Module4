package case_study_module4.controller;

import case_study_module4.model.Contract;
import case_study_module4.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService iContractService;
    @GetMapping("/home")
    public String display(@PageableDefault(size = 7)Pageable pageable, ModelMap modelMap){
        Page<Contract> list = iContractService.findAll(pageable);
        modelMap.addAttribute("listContract", list);
        return "contract/home";
    }
}
