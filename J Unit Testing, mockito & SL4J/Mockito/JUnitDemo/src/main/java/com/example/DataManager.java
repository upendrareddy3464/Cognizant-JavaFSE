package com.example;

public class DataManager {

    private DataProvider provider;

    public DataManager(DataProvider provider) {
        this.provider = provider;
    }

    public String displayData() {

        return provider.loadData();

    }
}