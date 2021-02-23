package io.github.chet20r;

import io.github.chet20r.ws.client.CalculatorSoap;
import io.github.chet20r.ws.client.tempuri.Add;
import io.github.chet20r.ws.client.tempuri.AddResponse;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExampleResource {

    @Inject
    CalculatorSoap soapClient;

    @GET
    @Path("/calculate")
    public AddResponse calculate() {
        Add add = new Add();
        add.setIntA(1);
        add.setIntB(2);
        return soapClient.add(add);
    }

    @GET
    public Map<String, String> hello() {
        var responseMap = new HashMap<String, String>();
        responseMap.put("result", "Hello World!");
        return responseMap;
    }
}