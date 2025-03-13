package PredefinedFunInterface;

import java.util.function.Supplier;

public class SupplierDemo2 {
    public static void main(String args[]){
        Supplier<String>s=()->"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        Supplier<String>s1=()->"abcdefghijklmnopqrstuvwxyz".toUpperCase();
        System.out.println(s.get());
        System.out.println(s1.get());

    }
}
