package com.service.impl;

import com.model.Music;
import com.repository.IMusicRepo;
import com.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepo iMusicRepo;
    @Override
    public List<Music> findAll() {
        return iMusicRepo.findAll();
    }

    @Override
    public void save(Music music) {
        iMusicRepo.save(music);
    }

    @Override
    public void delete(Integer id) {
        iMusicRepo.delete(id);
    }

    @Override
    public Music findById(Integer id) {
        return iMusicRepo.findById(id);
    }

    @Override
    public void update(Music music) {
        iMusicRepo.update(music);
    }
}
