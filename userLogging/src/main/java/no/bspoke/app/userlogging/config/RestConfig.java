package no.bspoke.app.userlogging.config;

import no.bspoke.app.userlogging.exception.UserNotFound;
import no.bspoke.app.userlogging.rest.UserLoggingRest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/internal")
public class RestConfig extends Application{
    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(UserLoggingRest.class, UserNotFound.class));
    }
}
