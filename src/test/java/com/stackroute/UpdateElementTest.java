package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateElementTest {

    UpdateElement element=new UpdateElement();
    List<String> fruits = Arrays.asList("Apple", "Grape", "Melon", "Berry");
    List<String> newFruits = Arrays.asList("Kiwi", "Grape", "Mango", "Berry");
    List<String> newList = Arrays.asList();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void UpdateElements()
    {
        assertEquals(newFruits,element.UpdateElements(fruits));
    }

    @Test
    public void DeleteElements()
    {
        assertEquals(newList,element.DeleteElements(newFruits));
    }
}