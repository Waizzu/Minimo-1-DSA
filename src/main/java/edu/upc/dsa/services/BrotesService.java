package edu.upc.dsa.services;


import edu.upc.dsa.Covid19Manager;
import edu.upc.dsa.Covid19ManagerImpl;
import edu.upc.dsa.models.Brote;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.LinkedList;

@Api(value = "/Brotes", description = "Descripcion (prueba modificado)")
@Path("/Brotes")
public class BrotesService {

    private Covid19Manager cm;

    public BrotesService() {
        this.cm = Covid19ManagerImpl.getInstance();
        if (cm.size()==0) {
            this.cm.addBrote("1","kike",17+"abril","masculino","jose.enrique.rios@upc.estudiant.upc.edu","5555","Av Gauss","negativo");

        }
    }

    @GET
    @ApiOperation(value = "Dame todos los brotes")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Brote.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)

    public Response getBrotes() {

            LinkedList<Brote> brotes = (LinkedList<Brote>) this.cm.findAll();
            GenericEntity<LinkedList<Brote>> entity = new GenericEntity<LinkedList<Brote>>(brotes) {
            };
            return Response.status(201).entity(entity).build();
    }
    @GET
    @ApiOperation(value = "Dame solo brotes confirmados ")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Brote.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBrotes2() {//falta if

        LinkedList<Brote> brotes = (LinkedList<Brote>) this.cm.findAll();
        GenericEntity<LinkedList<Brote>> entity = new GenericEntity<LinkedList<Brote>>(brotes) {
        };
        return Response.status(201).entity(entity).build();
    }
    @POST
    @ApiOperation(value = "Añade un nuevo brote")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=Brote.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newBrote(Brote brote) {

        if (brote.getNombre()==null || brote.getFecha()==null)  return Response.status(500).entity(brote).build();
        this.cm.addBrote(brote);
        return Response.status(201).entity(brote).build();
    }

}