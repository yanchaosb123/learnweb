package com.david.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.beans.Area;

/**
 * Created by z00473307 on 2019/3/23.
 */
public interface AreaRepository extends JpaRepository<Area,Long> {



    public Area findByAreaAndAreacode(String area, String areacode);

    //public Area findById(Long id);

}
