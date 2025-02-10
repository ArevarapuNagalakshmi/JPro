package FunctionalInterface;

import java.util.Arrays;

interface sortArray{
    public void sort(int a,int b);
}
public class SortArraywithLE {
    public static void main(String[] args){
        Integer arr[]={14,0,2,4,6,1,5};
        Arrays.sort(arr,(a,b)->Integer.compare(a,b));// to assigning the variables a,b and a,b  compare the array
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,(a,b)->(a-b));//a<b-a less than b
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,(a,b)->(b-a));//a>b means a greater than b
        System.out.println(Arrays.toString(arr));

    }
}