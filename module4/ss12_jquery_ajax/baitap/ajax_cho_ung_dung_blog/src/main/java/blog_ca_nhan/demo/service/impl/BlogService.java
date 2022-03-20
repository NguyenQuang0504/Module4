package blog_ca_nhan.demo.service.impl;

import blog_ca_nhan.demo.model.Blog;
import blog_ca_nhan.demo.repository.IBlogRepository;
import blog_ca_nhan.demo.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public List<Blog> findByName(String input_search) {
        return iBlogRepository.findByInput(input_search);
    }
}
