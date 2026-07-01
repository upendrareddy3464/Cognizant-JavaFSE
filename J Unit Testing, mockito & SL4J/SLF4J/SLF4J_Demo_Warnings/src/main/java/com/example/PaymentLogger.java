package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentLogger {

    private static final Logger logger =
            LoggerFactory.getLogger(PaymentLogger.class);

    public static void main(String[] args) {

        double accountBalance = 3000;
        double paymentAmount = 4500;
        boolean paymentGateway = false;

        if (paymentAmount > accountBalance) {
            logger.warn("Payment amount is greater than account balance.");
        }

        if (!paymentGateway) {
            logger.error("Payment gateway is unavailable.");
        }
    }
}