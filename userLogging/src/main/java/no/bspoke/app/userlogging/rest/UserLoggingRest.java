package no.bspoke.app.userlogging.rest;

import no.bspoke.app.userlogging.model.UserInfo;
import no.bspoke.app.userlogging.repository.UserLogRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

@Path("/logging")
public class UserLoggingRest {
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_XML})
    public Response getUser(@PathParam("id") String id) {
        UserInfo usrInfo = new UserInfo();

        usrInfo.setUserId("id");
        usrInfo.setUserName("name");
        GenericEntity<UserInfo> entity = new GenericEntity<UserInfo>(usrInfo, UserInfo.class);
        return Response.ok().entity(entity).build();
    }
}
