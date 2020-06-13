package com.mockitobasics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class SomeBusinessImplTest {
    @Test
    public void testFindTheGreatestFromAllData(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}

//Additional stub class. Instead, we can use mockito.
class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{24,6,15};
    }
}


//    DataService dataServiceMock = mock(DataService.class);
//    when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{23,12,34});
//
//        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
//        int result = someBusiness.findTheGreatestFromAllData();
//        assertEquals(24, result);