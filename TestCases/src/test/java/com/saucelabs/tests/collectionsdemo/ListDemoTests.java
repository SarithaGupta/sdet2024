package com.saucelabs.tests.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemoTests {
    public static void main(String[] args) {
        List productList = new ArrayList();
        ArrayList clientList = new ArrayList();
//insert the product records
        productList.add("iphone 11");
        productList.add("iphone 12");
        productList.add("iphone 13");
        productList.add("iphone 15");
        productList.add("Samsung s3");
        productList.add("Motorola Razor");
        productList.add("iphone 11");
        productList.add('L');
        productList.add(999.86);
        productList.add(true);
//fetch the records
        /*
        List is an interface to store the duplicate records.
        We can add any types of data
        * By using collections , we can store any kind of data. we no need to declare any data type here.
         */
        for(Object o:productList){
            System.out.println("List of Product is : " +o);
        }
        System.out.println("Size of the total product added : " +productList.size());
        //Another method for fetching records

        System.out.println("Customer required product is:  " +productList.get(4));

        //Lit - add(),size(),get()/for-each loop -These are the methods we learned in the List interface


    }
}
