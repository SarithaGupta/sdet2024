package com.saucelabs.tests.login;

public class ArrayDemo {
    public static void main(String[] args) {
        //declare the array
        int[] arr;
        arr= new int[5];
        arr[0] = 31;
        arr[1] = 21;
        arr[2] = 10;
        arr[3] = 11;
        arr[4] = 12;
       // arr[5] = 23; - ArrayIndexOutOfBoundException. as this memory allocation is not available.
        //alternate way to store the values
        int[] array = {2,4,6,8};
        //read the values
        /*
        we have 2 approaches to read the array values
         */
        //Read the array values using for loop
        for(int i = 0;i < arr.length;i++)
        {
            if(i==4) {
                System.out.println("index-4 value is:  " + arr[i]);
            }

        }
        //for each loop
        //if you want to read all the data go with 'for each loop'
        int temp =0; // this is not a good practice  bcoz we are declaring temp variable.
        for(int j: arr){
            if(temp==3) {
                System.out.println("Array values from for each loop: " + j);
            }
            temp++;
        }

    }
}
