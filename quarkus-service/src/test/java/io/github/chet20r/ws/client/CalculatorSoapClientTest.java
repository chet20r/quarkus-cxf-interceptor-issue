package io.github.chet20r.ws.client;

import io.github.chet20r.ws.client.tempuri.Add;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
class CalculatorSoapClientTest {

    @Inject
    CalculatorSoap soapClient;

    @Test
    void testCxfClient() {
        Add add = new Add();
        add.setIntA(11);
        add.setIntB(22);
        Assertions.assertEquals(33, soapClient.add(add).getAddResult());
    }

}
