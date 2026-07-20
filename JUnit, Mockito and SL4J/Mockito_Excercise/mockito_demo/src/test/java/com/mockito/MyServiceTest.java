package com.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when; 

public class MyServiceTest {
    

    @Test
    public void testExternalApi(){
        ExternalApi mockApi= Mockito.mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("Mocked Data");

        MyService myService = new MyService(mockApi);

        String result = myService.fetchData();
        assertEquals("Mocked Data", result);

        verify(mockApi).getData();
    }
}
