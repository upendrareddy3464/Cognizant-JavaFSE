package com.example;

public class CustomerService {

    private NotificationService notification;

    public CustomerService(NotificationService notification) {
        this.notification = notification;
    }

    public void addCustomer(String mobileNumber) {

        notification.sendMessage(mobileNumber);

    }
}