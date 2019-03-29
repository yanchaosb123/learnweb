package com.david.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by z00473307 on 2019/3/23.
 */
@Entity
@Table(name ="t_common_area")
public class Area {

    @Id
    private Long id;

    private String area;

    private String areacode;

    private String type;

    private String desc;

    protected  Area() {}


    public void setArea(String area) {
        this.area = area;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Area{" +
            "id=" + id +
            ", area='" + area + '\'' +
            ", areacode='" + areacode + '\'' +
            ", type='" + type + '\'' +
            ", desc='" + desc + '\'' +
            '}';
    }
}
