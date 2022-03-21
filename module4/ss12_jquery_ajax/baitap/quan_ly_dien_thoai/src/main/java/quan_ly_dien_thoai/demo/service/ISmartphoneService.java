package quan_ly_dien_thoai.demo.service;


import quan_ly_dien_thoai.demo.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);

    Smartphone findById1(Long id);
}
