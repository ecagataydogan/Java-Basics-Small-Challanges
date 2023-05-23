package dev.eso;

import java.util.Scanner;

public class MinimumChallange {
    public static void main(String[] args) {
        String inputStr = forInput();
        int[] inputIntArray = readIntegers(inputStr);
        int minValue = findMin(inputIntArray);
        System.out.println(minValue);



    }

    private static String forInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an array then i will find minimum value of that array");
        System.out.print("Please enter your array with commas for example => 5,7,9,3: ");
        String str = scanner.nextLine();
        return str;
    }

    private static int[] readIntegers(String str) {
        String[] strArray = str.split(",");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length ; i++) {
            int j = Integer.parseInt(strArray[i]);
            intArray[i] = j;
        }
        return intArray;
    }

    private static int findMin(int[] array) {
        int temp = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < temp) {
                temp = element;
            }
        }
        return temp;
    }
}
