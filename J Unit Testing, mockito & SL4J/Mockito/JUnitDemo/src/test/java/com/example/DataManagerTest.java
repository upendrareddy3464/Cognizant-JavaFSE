package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class DataManagerTest {

    @Test
    public void testDisplayData() {

        DataProvider provider = mock(DataProvider.class);

        when(provider.loadData()).thenReturn("Mockito Success");

        DataManager manager = new DataManager(provider);

        String output = manager.displayData();

        System.out.println("Output : " + output);

        assertEquals("Mockito Success", output);
    }
}