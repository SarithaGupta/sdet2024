package com.saucelabs.tests.collectionsdemo;

import com.google.common.hash.HashCode;

import java.util.*;

public class FindNumberOfOccurences {
    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<Integer>();

        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(2);
        input.add(5);
        input.add(6);
        input.add(7);
        input.add(5);
        input.add(8);
        input.add(9);
        input.add(5);
        input.add(9);
        input.add(6);
        input.add(6);

        //data parsing logic -terminology. that means whatever the operations we are performing
        FindNumberOfOccurences test = new FindNumberOfOccurences();
       // test.findDuplicates(input);
        test.findOcurances(input);


    }
    public void findDuplicates(List<Integer> list){
        HashSet set = new HashSet(); //for unique element collection
        List duplicateElements = new ArrayList(); //for duplicate element collection

        for(Object o:list){
            if(set.add(o)){
                System.out.println("Element inserted in set is : " +o);
            }else{
               duplicateElements.add(o);
            }
        }
        System.out.println("Size of the unique element collection :" +set.size());
        System.out.println("Size of the duplicate element collection :"+duplicateElements.size());
        //print duplicate elements as well
        Iterator iterator = duplicateElements.iterator();
        while(iterator.hasNext()){
            System.out.println("Duplicate element is :" +iterator.next());

    }


    }
    public void findOcurances(List<Integer> inputList){
        System.out.println("Size of the total number of input list : " +inputList.size());
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(Integer obj : inputList){
            if(frequencyMap.containsKey(obj)){
                frequencyMap.put(obj,frequencyMap.get(obj) + 1);

            }else{
                frequencyMap.put(obj,1);
            }

        }
        //pull the values from the map
        for(Map.Entry output: frequencyMap.entrySet()){
            System.out.println("Key is : " + output.getKey() + " , Value is: " +output.getValue());
        }
    }




}
