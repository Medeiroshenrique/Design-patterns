package com.pontoevirgulasoftwaresolutions.models;

public class PaymentResult {
    private boolean success;
    private String transactionId;
    private String message;
    private String paymentMethod;

    public PaymentResult(boolean success, String transactionId,
                         String message, String paymentMethod) {
        this.success = success;
        this.transactionId = transactionId;
        this.message = message;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "PaymentResult{" +
                "success=" + success +
                ", transactionId='" + transactionId + '\'' +
                ", message='" + message + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
