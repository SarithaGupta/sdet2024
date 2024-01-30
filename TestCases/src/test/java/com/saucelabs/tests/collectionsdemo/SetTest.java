package com.saucelabs.tests.collectionsdemo;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("CANADA");
        hs.add("INDIA");
        System.out.println(hs);
        System.out.println("Added...." +hs.add("AUSTRALIA"));
        hs.remove("CANADA");
        System.out.println("Size....: "+hs.size());
        System.out.println(hs);
        hs.add("He");
        hs.add("She");
        hs.add("North America");
        /*
        //Iterator concept - It is an interface actually
        -It will help us to traverse through each and every object present in the set interface
        --Usage of hasNext() - It will check whether the next index is present in the set collection or not.if
           it is present, then it returns true
           --In set , pull out the values in random fashion
         */

         Iterator<String> i = hs.iterator();
        while (i.hasNext()){  //while loop executing till the condition become false
            System.out.println("Iterating...." + i.next()); //it prints the value present in that index

        }




        List list = new LinkedList<>();
        list.add(12);
        list.add(15);
        list.add(18);
        list.add(20);
        list.add(12);
        list.add(15);
        list.add(3);
        list.add(4);
        list.add(1);
        //Find the duplicates by using Set
        Set set = new HashSet<>();
        /*for(Object obj: list){
            if(set.contains(obj)){
                System.out.println("Duplicate value is : " +obj);
            }else {
                set.add(obj);
            }
        }*/

        for(Object object: list){
            if(set.add(object)){
                System.out.println("Inserted record into set is :"+object);
            }else{
                System.out.println("Duplicate element identified.."+object);
            }
        }

    }
}
