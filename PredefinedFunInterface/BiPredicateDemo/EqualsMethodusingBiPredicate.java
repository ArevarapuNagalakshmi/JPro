package PredefinedFunInterface.BiPredicateDemo;

import java.util.function.BiPredicate;

public class EqualsMethodusingBiPredicate {
    public static void main(String args[]){
        BiPredicate<Integer,Integer>e=(a,b)->a.equals(b);
        System.out.println("5 and 5 is equal: " +e.test(5,5));
        System.out.println("10 and 5 is equal: " +e.test(10,5));
    }
}
