package com.repository;

import com.model.Music;

public interface IMusicRepo extends Repository<Music> {
    void save(Music music);

    void delete(Integer id);

    Music findById(Integer id);
}
