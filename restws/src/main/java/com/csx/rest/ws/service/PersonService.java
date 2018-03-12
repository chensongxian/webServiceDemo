package com.csx.rest.ws.service;

import com.csx.rest.ws.entity.PersonEntity;
import com.csx.rest.ws.entity.PersonEntityList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/02
 */
@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
public interface PersonService {
    @GET
    @Path("/getStatus")
    public String getStatus();

    @GET
    @Path("/getPerson/{index}")
    public PersonEntity getPersonEntityById(@PathParam("index") Integer id);

    @POST
    @Path("/getPersonList")
    public PersonEntityList getPersonList();
}
