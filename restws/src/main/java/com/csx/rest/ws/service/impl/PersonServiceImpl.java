package com.csx.rest.ws.service.impl;

import com.csx.rest.ws.DataSource;
import com.csx.rest.ws.entity.PersonEntity;
import com.csx.rest.ws.entity.PersonEntityList;
import com.csx.rest.ws.service.PersonService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/02
 */
@Component("personService")
public class PersonServiceImpl implements PersonService{
    @Override
    public String getStatus() {
        return "getStatus";
    }

    @Override
    public PersonEntity getPersonEntityById(Integer id) {
        List<PersonEntity> list = DataSource.getList();
        PersonEntity vo = null;
        if (list.size() > id) {
            vo = list.get(id - 1);
        }
        return vo;
    }

    @Override
    public PersonEntityList getPersonList() {
        List<PersonEntity> list = DataSource.getList();
        PersonEntityList listVo = new PersonEntityList(list);
        return listVo;
    }
}
