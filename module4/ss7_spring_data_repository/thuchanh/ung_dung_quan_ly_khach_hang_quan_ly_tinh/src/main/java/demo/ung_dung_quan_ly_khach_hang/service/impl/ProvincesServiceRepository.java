package demo.ung_dung_quan_ly_khach_hang.service.impl;

import demo.ung_dung_quan_ly_khach_hang.model.Provinces;
import demo.ung_dung_quan_ly_khach_hang.repository.IProvincesRepository;
import demo.ung_dung_quan_ly_khach_hang.service.IProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvincesServiceRepository implements IProvincesService {
    @Autowired
    private IProvincesRepository iProvincesRepository;

    @Override
    public List<Provinces> findAll() {
        return iProvincesRepository.findAll();
    }
}
