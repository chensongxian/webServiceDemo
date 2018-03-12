package com.csx.rest.ws.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/02
 */
@XmlRootElement
public class PersonEntity implements Serializable {

    private static final long serialVersionUID = -2732217390712335979L;

    private Integer id;
    private String name;
    private Integer age;
    private String desc;
    private Boolean status;

    public PersonEntity() {

    }

    public PersonEntity(Integer id, String name, Integer age, String desc, Boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.desc = desc;
        this.status = status;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
