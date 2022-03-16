package blog.demo.service.impl;

import blog.demo.model.Blog;
import blog.demo.repository.IBlogRepository;
import blog.demo.service.IBlogService;
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
    public Blog findById(Integer id) {
        return iBlogRepository.findById(id).orElse(null);
    }

//    @Override
//    public Blog findContent(Integer id) {
//        return iBlogRepository.findContent(id);
//    }
}
