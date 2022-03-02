package demo.ung_dung_blog_ca_nhan.service.impl;

import demo.ung_dung_blog_ca_nhan.model.Blog;
import demo.ung_dung_blog_ca_nhan.repository.IBlogRepository;
import demo.ung_dung_blog_ca_nhan.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(Integer id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findAllBlogById(Integer id, Pageable pageable) {
        return iBlogRepository.findAllBlogById(id, pageable);
    }

    @Override
    public Page<Blog> searchByName(String name, Pageable pageable) {
        return iBlogRepository.searchByName(name, pageable);
    }

}
