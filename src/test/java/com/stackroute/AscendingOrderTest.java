package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class AscendingOrderTest {


    TreeSet<String> string=new TreeSet<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test

    public void ascendingOrder1() throws Exception

    {
        List<String> stringActual=new ArrayList<String>(Arrays.asList("Harry","Olive","Alice","Bluto","Eugine"));
        assertEquals(string,new AscendingOrder().ascendingOrder(stringActual));

    }



    @Test

    public void ascendingOrder2() throws Exception

    {

        List<String> stringExpected=new ArrayList<String>(Arrays.asList("Alice" ,"Bluto",  "Eugine",  "Harry", "Olive"));

        assertEquals(stringExpected,new AscendingOrder().convertSet(string));



    }
}