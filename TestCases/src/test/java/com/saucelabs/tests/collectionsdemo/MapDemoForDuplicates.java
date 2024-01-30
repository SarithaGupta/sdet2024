package com.saucelabs.tests.collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemoForDuplicates {
    public static void main(String[] args) {
        Map<Integer,Integer> number_map= new HashMap();
        number_map.put(2,2)  ;
        number_map.put(1,1);
        number_map.put(3,1);
        number_map.put(5,3);
        number_map.put(5,2);//Key must be unique , and if you try to enter the key again, it is going to  override with new key.
        for(Map.Entry entry :number_map.entrySet() ){
            System.out.println("Key is : "+entry.getKey()+ " , Number of Occurrence is: " +entry.getValue());
        }
    }

}
