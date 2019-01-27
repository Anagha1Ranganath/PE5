package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static

import static org.junit.Assert.assertEquals;

public class MapReplaceValueTest {


    MapReplaceValue mapReplaceValue;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replaceValue1() {
        Map<String,String> map = new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");


        Map<String,String> map1 = new HashMap<>();
        map1.put("val1"," ");
        map1.put("val2","java");

        assertEquals(map1,mapReplaceValue.replaceValue(map));
    }
}