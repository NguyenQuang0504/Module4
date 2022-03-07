package demo.validate_bai_hat.service;

import demo.validate_bai_hat.model.TheSong;

import java.util.List;

public interface ITheSongService {
    List<TheSong> findAll();

    void save(TheSong theSong1);

    TheSong findById(Integer id);
}
