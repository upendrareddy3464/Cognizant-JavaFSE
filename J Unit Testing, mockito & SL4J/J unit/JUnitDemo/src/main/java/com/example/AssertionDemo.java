package com.example;

public class AssertionDemo {

    public int add(int a, int b) {
        return a + b;
    }

    public String getMessage() {
        return "Welcome";
    }

    public Object getObject() {
        return new Object();
    }

    public Object getNullObject() {
        return null;
    }

    public boolean isEligible(int age) {
        return age >= 18;
    }
}