package PredefinedFunInterface.PredecateDemo;

import java.util.function.Predicate;

public class FibonacciSeriesusingPredicate {
    public static void main(String args[]){
        int n=10;
        int a=0,b=1;
        Predicate<Integer>p=(num)->num%2==0;
                for(int i=1;i<=n;i++){
                   if(p.test(a)){
                       System.out.println(a+" : it is a fibnacci Series");
                   }else{
                       System.out.println(a+" : it is not a fibnacci Series");
                   }
                   int c=a+b;
                   a=b;
                   b=c;
        }
    }
}
