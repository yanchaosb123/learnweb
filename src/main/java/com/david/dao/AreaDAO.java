package com.david.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.david.beans.Area;

/**
 * Created by z00473307 on 2019/3/23.
 */
@Repository
public class AreaDAO {



    @PersistenceContext
    EntityManager em;



    public Area getAreaById(Long id) {

        return null;
    }

    public java.util.List getAreas() {
      return  em.createQuery("select a from Area a").getResultList();
    }
}
