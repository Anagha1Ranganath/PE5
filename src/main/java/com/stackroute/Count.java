package com.stackroute;

import java.lang.*;

import java.util.TreeMap;

public class Count {

    public TreeMap<String,Integer> CountFrequency(String str ){

        TreeMap<String,Integer> tm=new TreeMap<>();

        String[] strSplit=str.split("[\\s|\\@|\\-|\\_|\\,|\\*|\\?]+");

        int count = 0;
        String[] uniqueWord = new String[strSplit.length];

        uniqueWord[0] = strSplit[0];
        int index = 1;
        boolean uniqueWordPresent = false;

        for (int i = 1; i < strSplit.length; i++) {
            for (int j = 0; j <= index; j++) {
                if (strSplit[i].equals(uniqueWord[j])) {
                    uniqueWordPresent = true;
                }
            }

            if (!uniqueWordPresent) {
                uniqueWord[index] = strSplit[i];
                index++;
            }
            uniqueWordPresent = false;
        }
        for (String key : uniqueWord) {
            if (null == key) {
                break;
            }
            for (String s : strSplit) {
                if (key.equals(s)) {
                    count++;
                }
            }
            tm.put(key,count);
            count = 0;
        }
        return tm;
    }

}
