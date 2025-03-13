package PredefinedFunInterface.BiFunctionDemo;

import java.util.function.BiFunction;

public class AddtwonumusingBifun {
    public static void main(String args[]){
        BiFunction<Integer,Integer,Integer> add=(a,b)->a+b;
        int sum=add.apply(10,20);
        System.out.println("Sum of two numbers : " +sum);
    }
}
