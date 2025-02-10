package FunctionalInterface;

import java.util.Arrays;

public class SecBiggestNumArray {
    public static void main(String args[]){
       /* int arr[]={10,25,30,210,35,65,100};
        //10 25 30 35 65 100 210
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);*/
        int arr[]={10,25,30,210,35,65,100,300,400,500,10,20,30,50,10};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
                Arrays.sort(arr);
                System.out.println("The sort the numbers:" +largest);
            }else if(arr[i]>secondLargest && arr[i] !=largest){
                secondLargest=arr[i];

            }

        }
        if(secondLargest!=Integer.MIN_VALUE){
            System.out.println("The second largest number is: "+secondLargest);
        }else{
            System.out.println("This is not a second largest number is: "+secondLargest);
        }
    }
}
