package PredefinedFunInterface.BiPredicateDemo;

import java.util.function.BiPredicate;

public class EvenOddusingBipredicate {
    public static void main(String args[]) {
       /* BiPredicate<Integer, Integer> p = (n, a) -> n % a == 0;
        for (int i = 1; i <= 10; i++) {
            if (p.test(i,2)) {
                System.out.println(i + " : p is Even Number");
            } else {
                System.out.println(i + " : p is Odd number");
            }*/
        BiPredicate<Integer, Integer> p = (n, a) -> n % 2 == 0;
        for (int i = 1; i <= 10; i++) {
            if (p.test(i,0)) {
                System.out.println(i + " : p is Even Number");
            } else {
                System.out.println(i + " : p is Odd number");
            }
        }
    }
}
