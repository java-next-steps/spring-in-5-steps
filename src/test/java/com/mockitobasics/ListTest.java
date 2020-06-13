package com.mockitobasics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//JUnit5 syntax
@ExtendWith(MockitoExtension.class)
class ListTest {

    @Test
    public void testListSize(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
    }

    //MultipleReturn
    @Test
    public void testListSize_MultipleReturn(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20).thenReturn(30);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals(30, listMock.size());
    }

    //MethodWithSpecific Parameter
    @Test
    public void testGet_WithSpecificParam(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn(10);
        assertEquals(10, listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    //MethodWith Generic Parameter
    @Test
    public void testGet_WithGenericParam(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn(10);
        assertEquals(10, listMock.get(0));
        assertEquals(10, listMock.get(1));
        assertEquals(10, listMock.get(99));
    }
}



