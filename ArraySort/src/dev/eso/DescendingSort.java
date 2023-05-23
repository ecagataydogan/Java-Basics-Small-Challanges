package dev.eso;

import java.util.Arrays;
import java.util.Random;

public class DescendingSort {

    public static void main(String[] args) {
        int[] array = getRandomArray(3);
        System.out.println(Arrays.toString(array));
        int[] sortedArray = descendingSort(array);
        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] getRandomArray(int len) {
        int[] randomArray = new int[len];
        Random random = new Random();
        for (int i = 0; i<len ; i++) {
            randomArray[i] = random.nextInt(100);

        }
        return randomArray;
    }

    private static int[] descendingSort(int[] array) {
        int[] copyArray = Arrays.copyOf(array,array.length);
        boolean isSorted = false;
        while(!isSorted) {
            boolean flag = false;
            for (int i = 0; i < copyArray.length -1;i++) {
                if (copyArray[i] < copyArray[i+1]) {
                    int temp = copyArray[i+1];
                    copyArray[i+1] = copyArray[i];
                    copyArray[i] = temp;
                    flag = true;

                }
            }
            if (flag == false) break;
        }
        return copyArray;

    }
}

