package se.lexicon;

public class ArrayExercises {
    public static void main(String[] args) {
        ex2();
    }//main

/*  Write a program which will store elements in an array of type ‘int’ and
print it out.
Expected output: 11 23 39 etc. */

    public static void ex1() {
        int[] array = {11, 23, 39, 57, 46};
        System.out.println("Elements in the array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    /* Create a program and create a method with name ‘indexOf’ which will
find and return the index of an element in the array. If the element
doesn’t exist your method should return -1 as value.
Expected output: Index position of number 5 is: 2.*/

    public static void ex2() {
        int[] array = {3, 4, 5, 6, 7, 8};
        int numberToFind = 5;
        int index = indexOf(array, numberToFind);
        if (index != -1) {
            System.out.println("index position of number " + numberToFind + "is" + index + ".");
        } else {
            System.out.println("Number " + numberToFind + " does not exist in the array.");
        }
    }
    public static int indexOf(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }
}//class
