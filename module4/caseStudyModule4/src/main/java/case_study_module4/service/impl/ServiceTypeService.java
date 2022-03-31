package case_study_module4.service.impl;

import case_study_module4.model.ServiceType;
import case_study_module4.repository.IServiceTypeRepository;
import case_study_module4.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService {
    @Autowired
    private IServiceTypeRepository iServiceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return iServiceTypeRepository.findAll();
    }
}
