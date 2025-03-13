package PredefinedFunInterface.PredecateDemo;

import java.util.function.Predicate;

public class EmptyString {
    public static void main(String args[]){
        Predicate<String>p=str->str.isEmpty();
        String i="";
        String p1="Hello";
        System.out.println("Is String Empty ? "+p.test(i));
        System.out.println("Is String Empty ? "+p.test(p1));
    }
}
