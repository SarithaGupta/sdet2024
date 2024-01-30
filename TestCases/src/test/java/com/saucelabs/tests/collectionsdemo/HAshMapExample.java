package com.saucelabs.tests.collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HAshMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(0,"Hello");
        hm.put(1,"Good Morning");
        hm.put(42,"Saritha");
        hm.put(3,"How are you?");
        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        hm.remove(42);
        System.out.println(hm.get(42));
        //till now it is in HashMap. now i am converting it into Set
        /*
        entrySet() - each key and value will be stored as a set index
        --I need separate key and value as well . I don't want print the complete 0,hello should be printed as a string

         */

        //RahulShetty's Map
        /*
        This is an interview Qn. Create a hashtable. and pass the table to a set collection and
        print the key and value separately using iterator
         */
        Set entry= hm.entrySet();
        Iterator it= entry.iterator();
        while (it.hasNext()){
        Map.Entry mp    = (Map.Entry)it.next();
        System.out.println("Key is : "  +mp.getKey()+ ", Value is : " +mp.getValue());



        }




    }

}
