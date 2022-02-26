package com.repository.impl;

import com.model.Music;
import com.repository.IMusicRepo;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Queue;

@Transactional
public class MusicRepositoryImpl implements IMusicRepo {


    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Music> findAll() {
        TypedQuery<Music> query = em.createQuery("select c from Music c", Music.class);
        return query.getResultList();
    }

    @Override
    public void update(Music music) {
        if (music.getId()!=null){
         TypedQuery<Music> query = em.createQuery("update Music c set c.name =:name, c.nameArtist =:nameArtist, c.type =:type where c.id =:id", Music.class);
            query.setParameter("name", music.getName());
            query.setParameter("nameArtist", music.getNameArtist());
            query.setParameter("type", music.getType());
            query.setParameter("id", music.getId());
        }
        else {
            em.persist(music);
        }
    }

    @Override
    public void save(Music music) {
        if(music.getId() != null){
            em.merge(music);
        } else {
            em.persist(music);
        }
    }

    @Override
    public void delete(Integer id) {
        Music list = findById(id);
        if (list!=null){
            em.remove(list);
        }
    }
    @Override
    public Music findById(Integer id) {
        TypedQuery<Music> query = em.createQuery("select c from Music c where  c.id=:id", Music.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }
}
