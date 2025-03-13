package PredefinedFunInterface.BiFunctionDemo;

import java.util.function.BiFunction;

public class BiFunctionEX {
    public static void main(String args[]){
        BiFunction<String,String,String> f=(s1, s2)->s1+" "+s2;
        System.out.println(f.apply("Hello","World"));
//        System.out.println(f.apply("Hi"));
    }


}
