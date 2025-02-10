package FunctionalInterface;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddTwoArraynumbers {
    public static void main(String args[]) {
        int[] arr = {1, 4, 3, 5, 7};
        int[] arr1 = {2, 5, 4, 3, 6, 8, 1, 2};

        int[] n =new int[arr.length + arr1.length];
        int index=0;
        for(int num:arr)
            n[index++]=num;
        for(int num:arr1)
            n[index++]=num;
        System.out.println(n);
         Arrays.sort(n);
        System.out.println("Sorted array: " +Arrays.toString(n));

    }
}