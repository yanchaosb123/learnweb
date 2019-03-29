package com.david.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.david.dao.AreaDAO;

public class HelloService {



    @Autowired
    private AreaDAO areaDao;


    public java.util.List getAreas() {
        return areaDao.getAreas();
    }

    //
    // EntityManager

}
