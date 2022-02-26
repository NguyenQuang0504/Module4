package com.repository;

import com.model.Music;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    void update(Music music);
}
