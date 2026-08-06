package com.pontoevirgulasoftwaresolutions.creators;

import com.pontoevirgulasoftwaresolutions.products.PaymentProcessor;

public abstract class PaymentFactory {
    public abstract PaymentProcessor createProcessor();
}
