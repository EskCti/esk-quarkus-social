package org.eskcti.quarkussocial.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eskcti.quarkussocial.rest.dto.CreateUserRequest;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    @POST
    public Response createUser(CreateUserRequest userRequest) {
        return Response.ok(userRequest).build();
    }

    @GET
    public Response listAllUsers() {
        return Response.ok().build();
    }
}
