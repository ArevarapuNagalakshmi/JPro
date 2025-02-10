package FunctionalInterface;

import java.util.Arrays;

public class SortingarrusingFor {
    public static void main(String args[]){
        //Ascending order
       /* int arr[]={5,4,3,2,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted of:"+Arrays.toString(arr));*/

        //Decending order
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted of:"+Arrays.toString(arr));
    }
}
