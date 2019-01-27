package com.stackroute;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapReplaceValue {


    public Map<String,String> replaceValue(Map<String,String> str)
    {
        Map<String, String> map = new HashMap<>();
        if(str.containsKey("val1")&& str.containsKey("val2")) {
            str.replace("val2", "java");
            str.replace("val1", " ");
            System.out.println(str);
            return str;
        }
        else
            return map;
    }
}
