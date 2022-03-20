package quan_ly_dien_thoai.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import quan_ly_dien_thoai.demo.model.SmartPhone;
import quan_ly_dien_thoai.demo.service.ISmartPhoneService;

import java.util.List;

@RestController
@RequestMapping("/server")
public class SmartPhoneController {
    @Autowired
    private ISmartPhoneService iSmartPhoneService;
    @PostMapping("/create")
    public ResponseEntity<SmartPhone> createSmartPhone(@RequestBody SmartPhone smartPhone){
        return new ResponseEntity<>(iSmartPhoneService.save(smartPhone), HttpStatus.OK);
    }
    @GetMapping("/displayList")
    public ModelAndView displayList(){
        List<SmartPhone> list = iSmartPhoneService.findAll();
        ModelAndView modelAndView = new ModelAndView("phone/display", "list", list);
        return modelAndView;
    }
    @GetMapping
    public ResponseEntity<List<SmartPhone>> allPhones() {
        return new ResponseEntity<>(iSmartPhoneService.findAll(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<SmartPhone> deleteSmartphone(@PathVariable Integer id) {
        SmartPhone smartphoneOptional = iSmartPhoneService.findById(id);
        if (smartphoneOptional == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iSmartPhoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional, HttpStatus.NO_CONTENT);
    }
}
