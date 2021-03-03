package io.github.chet20r.service;

import io.github.chet20r.ws.client.CalculatorSoap;
import io.github.chet20r.ws.client.tempuri.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebService;

@WebService(endpointInterface = "io.github.chet20r.service.MyCalculatorServiceInterface")
public class MyCalculatorService implements MyCalculatorServiceInterface {
    private static final String METHOD_NOT_IMPLEMENTED = "Method not implemented";

    @Inject
    CalculatorSoap calculatorSoapClient; // I need a client that is configured to call the external service

    @Override
    public SubtractResponse subtract(Subtract parameters) {
        throw new UnsupportedOperationException(METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public DivideResponse divide(Divide parameters) {
        throw new UnsupportedOperationException(METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public AddResponse add(Add parameters) {
        // this should call the external soap service
        return calculatorSoapClient.add(parameters);
    }

    @Override
    public MultiplyResponse multiply(Multiply parameters) {
        throw new UnsupportedOperationException(METHOD_NOT_IMPLEMENTED);
    }
}
