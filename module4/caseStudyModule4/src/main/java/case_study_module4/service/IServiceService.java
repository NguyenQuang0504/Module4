package case_study_module4.service;

import case_study_module4.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IServiceService {
    void save(Service service);

    Page<Service> findAll(Pageable pageable);

    Service findById(Integer id);

    void delete(Integer id);
}
