package case_study_module4.service;

import case_study_module4.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Page<Contract> findAll(Pageable pageable);

    void save(Contract contract);
    List<Contract> findAll();
}
