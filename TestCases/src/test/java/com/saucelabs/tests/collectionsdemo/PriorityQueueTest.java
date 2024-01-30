package com.saucelabs.tests.collectionsdemo;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue q = new PriorityQueue<>();
        q.add(4);
        q.add(5);
        q.add(2);
        q.add(8);
        q.add(1);
        q.add(10);
     //   q.add("B");
      //  q.add("20"); //here B and 19 are string type. comparing integer with string (Typecasting pbm)
        /*
        While inserting the records, it is comparing with the available records.
         If you are trying to insert the string to integer, then typecasting problem may occur
         */
        for(Object obj : q){
            System.out.println(obj);
        }


    }
}
