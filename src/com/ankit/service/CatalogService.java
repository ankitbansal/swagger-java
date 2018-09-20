package com.ankit.service;

import com.ankit.model.Item;
import com.ankit.repository.CatalogRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by anbabans on 9/20/2018.
 */
@Path("/catalog")
@Api(value = "/catalog", description = "Manage inventory catalog")
public class CatalogService {

    @Inject
    private CatalogRepository catalogRepository;

    @Produces(value = MediaType.APPLICATION_JSON)
    @GET
    @ApiOperation( value = "List catalog of items", response = Item.class, responseContainer = "List")
    public List<Item> getCatalog() {
        return catalogRepository.getCatalog();
    }

    public Item getItem(@ApiParam( value = "Item id to look for", required = true ) @PathParam( "id" ) final int id ) {
        return catalogRepository.getItem(id);
    }
}
