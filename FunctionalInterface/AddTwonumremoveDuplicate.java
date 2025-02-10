package FunctionalInterface;

import java.util.Arrays;

public class AddTwonumremoveDuplicate {
    public static void main(String args[]){
    int a[]={1,2,4,5,7,3,9,1};
    int b[]={5,8,3,5,7,9,};
    int[] n =new int[a.length + b.length];
    int index=0;
        for(int num:a)
            n[index++]=num;
        for(int num:a)
            n[index++]=num;
        System.out.println(n);
         Arrays.sort(n);
        System.out.println("Sorted array: " +Arrays.toString(n));
}
}
