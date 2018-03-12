package com.csx.rest.ws.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/02
 */
@XmlRootElement
public class PersonEntityList implements Serializable{

    private static final long serialVersionUID = 9097781604083416210L;

    private List<PersonEntity> personList;

    public PersonEntityList(List<PersonEntity> personList) {
        super();
        this.personList = personList;
    }

    public PersonEntityList() {
        super();
    }

    public List<PersonEntity> getPersonList() {
        return personList;
    }


    public void setPersonList(List<PersonEntity> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "PersonEntityList [personList=" + personList + "]";
    }
}
