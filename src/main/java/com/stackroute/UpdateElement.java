package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {
    public List<String> UpdateElements(List<String> fruits) {
//        List<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Grape");
//        fruits.add("Melon");
//        fruits.add("Berry");
//
//        for(String result:fruits)
//        {
//            System.out.println(result);
//        }
//    }
        List<String> newFruits = new ArrayList<>();
        newFruits = fruits;
        newFruits.set(0, "Kiwi");
        newFruits.set(2, "Mango");
        return newFruits;
//        fruits.set(0,"kiwi");
//        fruits.set(2,"mango");
//        return fruits;

    }

    public List<String> DeleteElements(List<String> newFruits)
    {
        List<String> newList = new ArrayList<>();
      //  newList=newFruits;
        newList.removeAll(newFruits);
        return newList;
    }
}
