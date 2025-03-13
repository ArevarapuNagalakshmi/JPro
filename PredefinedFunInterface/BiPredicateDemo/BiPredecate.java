package PredefinedFunInterface.BiPredicateDemo;

import java.util.function.BiPredicate;

public class BiPredecate {
    public static void main(String args[]){
        BiPredicate<Integer,Integer> b=(a,b1)->(a+b1)%2==0;
        System.out.println(b.test(4,5));
        System.out.println(b.test(2,2));
    }
}
