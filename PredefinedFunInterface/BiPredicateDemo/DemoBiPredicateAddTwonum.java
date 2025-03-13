package PredefinedFunInterface.BiPredicateDemo;

import java.util.function.BiPredicate;

public class DemoBiPredicateAddTwonum {
    public static void main(String args[]){
        int a=10;
        int b1=20;
        BiPredicate<Integer,Integer> b=(x,y)->{
            int sum=x+y;
            System.out.println("Sum of " +x+ " and " +y+ " is: " +sum);
            return true;
        };
        b.test(a,b1);
    }
}
