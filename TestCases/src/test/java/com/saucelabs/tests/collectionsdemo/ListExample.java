package com.saucelabs.tests.collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        /*
        All the classes which implements List Interface accepts duplicate values.
        -These are the classes implements List interface(ArrayList,LinkedList and Vector)
        -Diff between Array and ArrayList- Array has fixed size where as ArrayList can grow dynamically.
        -You can access and insert any value in any index
        It will treat it as separate index
         */
        //ArrayList<Integer> a = new ArrayList<Integer>();
        LinkedList students = new LinkedList();
        students.add("1");
        students.add("2");
        students.add("5");
        students.add("3");
        students.add("6");
        students.add("Automation");
        students.add("Automation"); //accepts duplicate values.It will treat it as separate index
        students.add(1,"7");
        students.remove(3);
       // students.remove("2");
        System.out.println("Using get method to pull the 4th index data : "+ students.get(4));
        System.out.println(students.contains("1"));
        System.out.println(students.contains("testing"));
        System.out.println(students.indexOf("Automation"));
        System.out.println("Size :" +students.size());
        System.out.println("Is Empty ? " +students.isEmpty());
        /* pull the data from collections
        -get()
        -fo-each loop
        -iterator()

         */
        for(Object obj: students){
            System.out.println("data from linked list : " +obj);
        }

    //this is implemented from list interface as well as queue interface

    }



}
