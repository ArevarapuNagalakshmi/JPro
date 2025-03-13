package FunctionalInterface;

import java.util.Arrays;

public class RotateArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int n=3;
        int length=arr.length;
        int[] ArrayRotate=new int[length];
        for(int i=0;i<length;i++){
            ArrayRotate[(i+n)%length]=arr[i];
        }
        for(int i=0;i<length;i++){
            arr[i]=ArrayRotate[i];
        }
        System.out.println("Array after rotate by "+n+ "position: "+ Arrays.toString(arr));
    }
}
