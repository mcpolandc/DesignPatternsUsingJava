package com.adapter;

import java.util.Arrays;
import java.util.List;


/*
*
*
*
*   Simple demonstration of using an existing implementation of the adapter pattern
*
*       Converting array to list
*
*
*
*/

public class SimpleAdapterDemo {


        public static void main(String[] args) {

            Integer[] arrayOfInts = new Integer[] {42, 43, 44};

            //Adapt array into list thus abstracting developer from what is going on behind the scenes
            List<Integer> listOfInts = Arrays.asList(arrayOfInts);

            System.out.println(arrayOfInts);
            System.out.println(listOfInts);
        }
}

