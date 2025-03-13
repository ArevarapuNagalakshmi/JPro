package PredefinedFunInterface.BiFunctionDemo;

import java.util.function.BiFunction;

public class FibonacciusingBifun {
    public static void main(String args[]){
        int n=10;
        BiFunction<Integer,String,String>a=(num,a1)->{
            if(num<=0){
                return "Invalid";
            }
            int b=0,c=1,sum;
            StringBuilder r=new StringBuilder(a1+": "+b+", "+c);
            for(int i=2;i<num;i++){
                sum=b+c;
                r.append(", ").append(sum);
                b=c;
                c=sum;
            }
            return r.toString();
        };
     System.out.println(a.apply(n,"Fibonacci Series"));
    }
}
