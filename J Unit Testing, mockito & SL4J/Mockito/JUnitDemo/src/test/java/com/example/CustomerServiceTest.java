package com.example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class CustomerServiceTest {

    @Test
    public void testAddCustomer() {

        NotificationService notify = mock(NotificationService.class);

        CustomerService customer = new CustomerService(notify);

        String number = "9876543210";

        customer.addCustomer(number);

        verify(notify).sendMessage(number);

        System.out.println("Message service verified.");
    }
}