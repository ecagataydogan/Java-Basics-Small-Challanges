package dev.eso;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = reverse(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));

    }
    private static int[] reverse(int[] array) {
        int[] reversedArray = Arrays.copyOf(array,array.length);
        int maxIndex = array.length - 1;
        for (int i = 0; i < array.length ; i++) {
            reversedArray[i] = array[maxIndex];
            maxIndex--;
        }
        return reversedArray;
    }
}
