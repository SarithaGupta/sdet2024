package com.saucelabs.tests.collectionsdemo;

import java.util.*;

public class Rahul_Collection_PrintUniquenumber {
    public static void main(String[] args) {
        int a[]= {2,3,2,4,3,5,6,5,4,3,7,8,6,7,9};

        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(3);
        array.add(2);
        array.add(4);
        array.add(3);
        array.add(5);
        array.add(6);
        array.add(5);
        array.add(4);
        array.add(3);
        array.add(7);
        array.add(8);
        array.add(6);
        array.add(7);
        array.add(9);
        Set set = new HashSet();
        List duplicate =  new ArrayList();
        for(Object i: array){
            if(set.add(i)){
                System.out.println("Element " +i);
            }else {
                duplicate.add(i);
            }


        }
        for(Object dup :duplicate){
            System.out.println("Duplicate elements: "+dup);
        }
        //Print unique number
        ArrayList al = new ArrayList();

        for(int i = 0;i < a.length; i++) {
            int k=0;
            if (!al.contains(a[i])) {
                al.add(a[i]);
                k++;


                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }
                }
                System.out.println("A[i] value " + a[i]);
                System.out.println("K value " + k);
                if(k==1){
                    System.out.println("Unique numbers are " +a[i]);
                }
            }

        }



    }



}
