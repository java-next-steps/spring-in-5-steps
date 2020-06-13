package com.mockitobasics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//JUnit5 syntax
@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockAnnotationTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void testFindTheGreatestFromAllData(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{23,12,34});

        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(34, result);
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{23});

        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(23, result);
    }

    @Test
    public void testFindTheGreatestFromAllData_WithNoValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});

        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(Integer.MIN_VALUE, result);
    }
}



