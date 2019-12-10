package no.bspoke.app.userlogging.client;

import no.bspoke.app.userlogging.model.UserInfo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class UserRestClient {
    private static final String REST_URI = "http://localhost:8080/internal";

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(REST_URI).path("logging").path("id");

        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_XML);
        Response response = invocationBuilder.get();

        UserInfo userInfo = response.readEntity(UserInfo.class);
        System.out.println(userInfo.toString());
    }
}
