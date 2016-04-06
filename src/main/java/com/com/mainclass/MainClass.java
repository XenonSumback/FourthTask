package com.com.mainclass;

import com.com.mygeneric.MyGeneric;

import java.util.Arrays;

     /**
     * Entry point
     */

    public final class MainClass {
        /**
         * Default constructor
         *
         */
        private MainClass() {
        }
        /**
         * main method
         * @param arg incoming arguments
         */
        public static void main(final String[] arg) {
            final Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            final Character[] charArray = {'s', 'p', 'r', 'i', 'n', 'g'} ;
            final Double[] doubleArray = {1.2, 2.5, 3.5, 4.9, 5.0, 6.8, 7.5, 8.4, 9.6, 10.6};
            System.out.println("The arrays: ");
            System.out.print(Arrays.asList(intArray) + "\n");
            System.out.print(Arrays.asList(charArray) + "\n");
            System.out.print(Arrays.asList(doubleArray) + "\n");
            MyGeneric<Integer> intGen = new MyGeneric<Integer>(intArray);
            MyGeneric<Character> charGen = new MyGeneric<Character>(charArray);
            MyGeneric<Double> doubleGen = new MyGeneric<Double>(doubleArray);
            System.out.print("Reversed arrays: \n");
            System.out.print(Arrays.asList(intGen.reverse(intArray)) + "\n");
            System.out.print(Arrays.asList(charGen.reverse(charArray)) + "\n");
            System.out.print(Arrays.asList(doubleGen.reverse(doubleArray)) + "\n");
        }
    }
