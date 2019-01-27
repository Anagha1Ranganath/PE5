package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class CharacterCountTest {

    CharacterCount count=new CharacterCount();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void CountCharacter() throws Exception
    {

        List<String> actual = Arrays.asList("a","b","c","d","a","c","c");

        TreeMap<String,Boolean> expected= new TreeMap<>();

        expected.put("a",true);

        expected.put("b",false);

        expected.put("c",true);

        expected.put("d",false);

        assertEquals(expected,count.CountCharacter(actual));
    }
}