package com.csx.rest.ws;

import com.csx.rest.ws.entity.PersonEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/02
 */
public class DataSource {
    private static List<PersonEntity> list;

    static {
        DataSource.list = new ArrayList<PersonEntity>();

        for (int i = 0; i < 10; i++) {
            PersonEntity vo = new PersonEntity(i, "name" + i, Math.round(100.0f),
                    "desc" + i, (i & 1) == 0);
            DataSource.list.add(vo);
        }
    }

    public static List<PersonEntity> getList() {
        return DataSource.list;
    }
}
