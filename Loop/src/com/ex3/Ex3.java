/*
Implement a Java function that finds two neighbouring numbers
in an array with the smallest distance to each other.
The function should return the index of the first number.
 */
package com.ex3;

//
public class Ex3 {
    public static void main(String[] args) {
        int [] array = {1, 10, 11, -2, 1, 4};
        int rangeMin = Math.abs(array[0]-array[1]);
//        int index1 = 0, index2 = 0;
        int index = 0;
        for (int i=0; i<array.length-1; i++) {
            int range = Math.abs(array[i] - array[i+1]);
            if (range < rangeMin){
                rangeMin = range;
                index = i;
            }
        }
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                int min = Math.abs(array[i]-array[j]);
//                if (min < rangeMin){
//                    rangeMin = min;
//                    index1 = i;
//                    index2 = j;
//                }
//            }
//        }
        System.out.println("The neighbouring that have min range " + rangeMin);
//        System.out.println("index is " + index1 + " " + index2);
        System.out.println("index is " + index);
    }
}
