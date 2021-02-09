package com.bandanarama.Testing.business;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void letsMockListSize_ReturnMultipleValues(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());
    }

    @Test
    public void letsMockList_throwAnException(){
        List listMock = mock(List.class);
        //Argument matcher
        //when(listMock.get(0)).thenReturn("bandanarama");
        //Argument matcher
        when(listMock.get(anyInt())).thenReturn("bandanarama");
        assertEquals("bandanarama",listMock.get(0));
        assertEquals("bandanarama",listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void letsMockListGet(){
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
        listMock.get(0);
    }
}
