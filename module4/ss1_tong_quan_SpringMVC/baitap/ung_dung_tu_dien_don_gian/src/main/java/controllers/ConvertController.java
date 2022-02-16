package controllers;

import model.Convert;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ConvertService;
import service.serviceImp.ConvertServiceImpl;

import java.util.List;

@Controller
public class ConvertController {
    private ConvertServiceImpl convertService = new ConvertService();
    @GetMapping("/controller")
    public String index(){
        return "index";
    }
    @PostMapping("/controller")
    public String convert(@RequestParam String vie, Model model){
        List<Convert> convertList = convertService.display();
        for (int i=0;i<convertList.size();i++){
            if(vie.equalsIgnoreCase(convertList.get(i).getEng())){
                model.addAttribute("result", convertList.get(i).getVie());
                return "display";
            }
        }
        return "display";
    }
}
