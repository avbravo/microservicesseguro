/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesseguro.resources;

import com.avbravo.microservicesseguro.entity.Paises;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author avbravo
 */
@Stateless
@Path("/paises")
public class PaisesResources {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed({"administrador"})
    public List<Paises> getPaises() {

        List<Paises> paises = new ArrayList<Paises>();
        paises.add(new Paises("pa", "Panama"));
        paises.add(new Paises("cu", "Cuba"));
        paises.add(new Paises("co", "Colombia"));
        paises.add(new Paises("es", "España"));

        return paises;

    }
}
