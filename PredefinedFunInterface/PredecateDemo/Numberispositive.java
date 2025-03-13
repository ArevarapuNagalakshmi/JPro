package PredefinedFunInterface.PredecateDemo;

import java.util.function.Predicate;

public class Numberispositive {
    public static void main(String args[]){
        Predicate<Integer>p=num->num>0;
        int a=5;
        System.out.println("Is nmber is Pssitive ?" +p.test(a));
    }
}
