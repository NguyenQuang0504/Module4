package demo.ung_dung_blog_ca_nhan.service.impl;

import demo.ung_dung_blog_ca_nhan.model.Category;
import demo.ung_dung_blog_ca_nhan.repository.ICategoryRepository;
import demo.ung_dung_blog_ca_nhan.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return iCategoryRepository.findAll(pageable);
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public void deleteById(Integer id) {
        iCategoryRepository.deleteById(id);
    }
}
