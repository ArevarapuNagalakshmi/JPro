package PredefinedFunInterface.BiFunctionDemo;

import java.util.function.BiFunction;

public class EvenOddnumusingBifun {
    public static void main(String args[]) {
        BiFunction<Integer, String, String> a = (num, msg) ->
                (num % 2 == 0) ? msg + "Even" : msg + "odd";
        System.out.println(a.apply(10, "Number is :"));
        System.out.println(a.apply(21, "Number is :"));
    }
}
