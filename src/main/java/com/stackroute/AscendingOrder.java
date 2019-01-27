package com.stackroute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class AscendingOrder {
    public static TreeSet<String> ascendingOrder(List<String> str)

    {

        TreeSet<String> treeSet=new TreeSet<String>(str);

        Iterator<String> iterator=treeSet.iterator();

        iterator.next();

        return treeSet;

    }

    public List<String> convertSet(TreeSet<String> set)

    {

        List<String> arrayList=new ArrayList<String>(set);

        Iterator<String> iterator=arrayList.iterator();

        return arrayList;

    }
}
