package PredefinedFunInterface.BiFunctionDemo;

import java.util.function.BiFunction;

public class EqualMethodWithBiFun {
    public static void main(String args[]){
        BiFunction<String,String,String> s=(str,str1)-> String.valueOf(str.equals(str1));
        System.out.println("String is equals : " +s.apply("Hi","Hello"));
        System.out.println("String is equals : " +s.apply("Hello","Hello"));
    }
}
