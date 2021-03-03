package io.github.chet20r.service;

import io.github.chet20r.ws.client.tempuri.*;

public interface MyCalculatorServiceInterface {

    SubtractResponse subtract(Subtract parameters);

    AddResponse add(Add parameters);

    DivideResponse divide(Divide parameters);

    MultiplyResponse multiply(Multiply parameters);
}
