package com.mockitobasics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockTest {
    @Test
    public void testFindTheGreatestFromAllData(){
        //Mock data
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{23,12,34});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(34, result);
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue(){
        //Mock data
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{23});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(23, result);
    }
}



