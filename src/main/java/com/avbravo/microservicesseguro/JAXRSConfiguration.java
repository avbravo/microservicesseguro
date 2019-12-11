package com.avbravo.microservicesseguro;

import java.util.Set;
import javax.annotation.security.DeclareRoles;
import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures JAX-RS for the application.
 *
 * @author Juneau
 */
@ApplicationScoped
@ApplicationPath("resources")
@DeclareRoles({ "administrador", "testing" })
@BasicAuthenticationMechanismDefinition(realmName = "admin-realm")
public class JAXRSConfiguration extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(com.avbravo.microservicesseguro.resources.PaisesResources.class);

        return resources;
    }


}
