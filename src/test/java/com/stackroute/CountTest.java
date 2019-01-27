package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class CountTest {

    Count count=new Count();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void CountFrequency() {
        String actual= "one one -one___two,,three,one @three*one?two";

        TreeMap<String,Integer> expected= new TreeMap<>();

        expected.put("one",5);

        expected.put("two",2);

        expected.put("three",2);

        assertEquals(expected,count.CountFrequency(actual));
    }
}