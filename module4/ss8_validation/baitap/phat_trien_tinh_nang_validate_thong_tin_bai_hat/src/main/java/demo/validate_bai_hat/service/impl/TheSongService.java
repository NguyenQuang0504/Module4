package demo.validate_bai_hat.service.impl;

import demo.validate_bai_hat.model.TheSong;
import demo.validate_bai_hat.repository.ITheSongRepository;
import demo.validate_bai_hat.service.ITheSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheSongService implements ITheSongService {
    @Autowired
    private ITheSongRepository iTheSongRepository;

    @Override
    public List<TheSong> findAll() {
        return iTheSongRepository.findAll();
    }

    @Override
    public void save(TheSong theSong1) {
        iTheSongRepository.save(theSong1);
    }

    @Override
    public TheSong findById(Integer id) {
        return iTheSongRepository.findById(id).orElse(null);
    }
}
