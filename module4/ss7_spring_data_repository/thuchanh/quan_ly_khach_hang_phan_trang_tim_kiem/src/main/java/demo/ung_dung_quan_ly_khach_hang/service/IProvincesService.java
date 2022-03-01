package demo.ung_dung_quan_ly_khach_hang.service;

import demo.ung_dung_quan_ly_khach_hang.model.Customer;
import demo.ung_dung_quan_ly_khach_hang.model.Provinces;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProvincesService {
    List<Provinces> findAll();

    void save(Provinces provinces);

}
