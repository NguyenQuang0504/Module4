package case_study_module4.controller;

import case_study_module4.model.RentType;
import case_study_module4.model.Service;
import case_study_module4.model.ServiceType;
import case_study_module4.service.IRentTypeService;
import case_study_module4.service.IServiceService;
import case_study_module4.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private IRentTypeService iRentTypeService;
    @Autowired
    private IServiceTypeService iServiceTypeService;
    @Autowired
    private IServiceService iServiceService;
    @GetMapping("/create")
    public String createService(ModelMap modelMap){
        List<RentType> list = iRentTypeService.findAll();
        List<ServiceType> serviceTypeList = iServiceTypeService.findAll();
        modelMap.addAttribute("listRentType",list);
        modelMap.addAttribute("listServiceType", serviceTypeList);
        modelMap.addAttribute("service", new Service());
        return "view_service/create_service";
    }
    @PostMapping("/save")
    public String saveService(@ModelAttribute Service service){
        iServiceService.save(service);
        return "redirect:/";
    }
}
