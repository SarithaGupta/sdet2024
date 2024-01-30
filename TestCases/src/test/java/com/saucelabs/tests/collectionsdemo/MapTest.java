package com.saucelabs.tests.collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<String,Integer>();
       // HashMap map = new HashMap(); //we can use this also for declaring
        students.put("Jack",16);
        students.put("Smith",20);

        System.out.println("pull Data from map: " +students.get("Jack"));//another method
        //To pull all the values we are going to use 'entrySet()'

        for(Map.Entry entry: students.entrySet()){
            System.out.println("Key is : " +entry.getKey() + ", Value is : " +entry.getValue());

        }

    }
}
