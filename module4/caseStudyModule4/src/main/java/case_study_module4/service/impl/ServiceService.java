package case_study_module4.service.impl;

import case_study_module4.repository.IServiceRepository;
import case_study_module4.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService implements IServiceService {
    @Autowired
    private IServiceRepository iServiceRepository;

    @Override
    public void save(case_study_module4.model.Service service) {
        iServiceRepository.save(service);
    }
}
