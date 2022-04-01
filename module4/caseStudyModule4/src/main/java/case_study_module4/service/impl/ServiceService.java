package case_study_module4.service.impl;

import case_study_module4.repository.IServiceRepository;
import case_study_module4.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService implements IServiceService {
    @Autowired
    private IServiceRepository iServiceRepository;

    @Override
    public void save(case_study_module4.model.Service service) {
        iServiceRepository.save(service);
    }

    @Override
    public Page<case_study_module4.model.Service> findAll(Pageable pageable) {
        return iServiceRepository.findAll(pageable);
    }

    @Override
    public case_study_module4.model.Service findById(Integer id) {
        return iServiceRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        iServiceRepository.deleteById(id);
    }

    @Override
    public List<case_study_module4.model.Service> findAll1() {
        return iServiceRepository.findAll();
    }
}
