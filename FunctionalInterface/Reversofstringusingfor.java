package FunctionalInterface;

import java.util.Arrays;

public class Reversofstringusingfor {
    public static void main(String args[]){
        /*String str="Jyothi";
        String s1="";
        for(int i=str.length()-1;i>=0;i--){
            s1=s1+str.charAt(i);
        }
        System.out.println(s1);*/
        String arr[]={"Hello","Hii","apple","Mahi","Banana","cat"};

        for(int i=0,j=arr.length-1;i<j;i++,j--){
            String a=arr[i];
            arr[i]=arr[j];
            arr[j]=a;
        }
        System.out.println(Arrays.toString(arr));

    }
}
