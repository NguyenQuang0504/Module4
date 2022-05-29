package exam.demo.service.impl;

import exam.demo.model.ProductType;
import exam.demo.repository.IProductTypeRepository;
import exam.demo.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService implements IProductTypeService {
    @Autowired
    private IProductTypeRepository iProductTypeRepository;
    @Override
    public List<ProductType> findAll() {
        return iProductTypeRepository.findAll();
    }
}
