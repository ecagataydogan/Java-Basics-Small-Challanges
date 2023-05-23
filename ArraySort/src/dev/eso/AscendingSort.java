package dev.eso;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        System.out.println("Give me an array and i will sort it");
        System.out.print("Please enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = getIntegers(arraySize);
        int[] sortedArray = ascendingSort(array);
        System.out.println("Unsorted array" + Arrays.toString(array));
        System.out.println("Sorted array " + Arrays.toString(sortedArray));


    }

    private static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];
        System.out.printf("You will give %d number ",len);
        System.out.println("");
        for(int i = 0 ; i < array.length ; i++) {
            System.out.printf("%d:",i+1);
            array[i] = scanner.nextInt();
        }
        return array;

    }

    private static int[] ascendingSort(int[] array) {
        int[] copyOfArray = Arrays.copyOf(array,array.length);
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 ; i++) {
                if(copyOfArray[i] > copyOfArray[i+1]) {
                    int temp = copyOfArray[i];
                    copyOfArray[i] = copyOfArray[i+1];
                    copyOfArray[i+1] = temp;
                    isSorted = false;
                }
            }

        }
        return copyOfArray;
    }
}
