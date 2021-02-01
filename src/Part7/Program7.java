package Part7;

import java.util.Arrays;

public class Program7 {
    public static void main(String[] args) {
        int[] array = {10,5,7,3,1};
        byte n = 1;
        swingNum(array,n);

    }
    public static void swingNum (int[] array, byte n){
        System.out.println(Arrays.toString(array));
        int buff=0;
        if (n>0) {
            for (int i = array.length-1; i == 0; i--) {
                buff = array[i];
                if ((i + n) > array.length) {
                    array[i] = array[(array.length-1) - i + n];
                    array[(array.length-1) - i + n]=buff;
                } else {
                    array[i] = array[i+n];
                    array[i+n]=buff;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }

}