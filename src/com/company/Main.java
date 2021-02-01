package com.company;

import Part7.Program7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {10,5,7,3,1};
        byte n = 4;
        swingNum(array,n);

    }
    public static void swingNum (int[] array, byte n) {
        System.out.println(Arrays.toString(array));
        int buff = 0, x = array.length - 1;
        int count = 0;
        while (count < n) {
            if (n > 0) {
                for (int i = x; i > 0; i--) {
                    buff = array[i];
                    if (i + 1 > array.length - 1) {
                        array[i] = array[(array.length - 1) - i];
                        array[(array.length - 1) - i] = buff;
                    } else {
                        array[i] = array[i + 1];
                        array[i + 1] = buff;
                    }
                }
            }
            count++;
        }
        System.out.println(Arrays.toString(array));
    }
}
