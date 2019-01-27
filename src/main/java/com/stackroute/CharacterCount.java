package com.stackroute;

import java.util.*;

public class CharacterCount {
    public TreeMap<String,Boolean> CountCharacter(List<String> str )
    {
        TreeMap<String,Boolean> tm=new TreeMap<>();

        int count = 0;
        List<String> uniqueWord=new ArrayList<>();

        uniqueWord.add(0,str.get(0));
        int index = 1;
        boolean uniqueWordPresent = false;

        for (int i = 0; i < str.size(); i++) {
            for (int j = 0; j < index; j++) {
                if ((str.get(i)).equals(uniqueWord.get(j))) {
                    uniqueWordPresent = true;
                }
            }

            if (!uniqueWordPresent) {
                uniqueWord.add(index,str.get(i));
                index++;
            }
            uniqueWordPresent = false;
        }
        for (String key : uniqueWord) {
            if (key==null) {
                break;
            }
            for (String s : str) {
                if (key.equals(s)) {
                    count++;
                    if(count>=2)
                    {
                        tm.put(key,true);
                    }
                    else
                    {
                        tm.put(key,false);
                    }
                }
            }
            count = 0;
        }
        return tm;
    }
}
