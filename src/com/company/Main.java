package com.company;

//import Part7.Program7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {10,5,7,3,1,18,-6,4,-2};
        byte n = -4;
        swingNum(array,n);

    }
    public static void swingNum (int[] array, byte n) {
        System.out.println(Arrays.toString(array));
        int buff = 0;
        int maxIndex = array.length - 1;                // Переменная для определения максимального индекса в массиве
        int count = 0;
        while (count < Math.abs(n)) {                             // Будем запускать цикл сдвига на 1 позицию нужное нам количество раз (n)
            if (n > 0) {                                // Если n - положительное
                for (int i = maxIndex; i > 0; i--) {    // Запускаем цикл чтобы сдвинуть на 1 место вправо
                                                        // Цикл идет от конца массива к началу
                    buff = array[i];
                    if (i + 1 > maxIndex) {             // Условие для перехода через конец массива в его начало
                        array[i] = array[(maxIndex) - i];
                        array[(maxIndex) - i] = buff;
                    } else {
                        array[i] = array[i + 1];
                        array[i + 1] = buff;
                    }
                }
            } else if (n<0) {                               // Если n - отрицательное
                for (int i = 0; i<maxIndex; i++){           // Запускаем цикл чтобы сдвинуть на 1 место влево
                    // Цикл идет в прямом направлении от нулевого члена к последнему
                    buff = array[i];
                    if (i-1 <0) {                           // Условие для перехода через начало массива в его конец
                        array[i] = array[maxIndex-i];
                        array[maxIndex-i] = buff;
                    } else {
                        array[i] = array[i-1];              // Условие для членов массива, не переходящих через границу
                        array[i-1] = buff;
                    }
                }
            }
            count++;                                        // счетчик циклов
        }
        System.out.println(Arrays.toString(array));
    }
}
