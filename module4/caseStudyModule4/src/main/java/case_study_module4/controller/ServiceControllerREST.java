package case_study_module4.controller;

import case_study_module4.model.Service;
import case_study_module4.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServiceControllerREST {
    @Autowired
    private IServiceService iServiceService;

    @DeleteMapping("/service/delete")
    public ResponseEntity<Service> delete(String Id){
        System.out.println(Id);
        Integer id = Integer.parseInt(Id);
        Service service = iServiceService.findById(id);
        iServiceService.delete(id);
        return new ResponseEntity<>(service, HttpStatus.NO_CONTENT);
    }
}
