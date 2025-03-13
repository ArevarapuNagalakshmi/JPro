package PredefinedFunInterface;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CunsumerSupplier {

    public static void main(String args[]){
        int num=7;
        Consumer<String> c1=(result)->System.out.println(result);
        Supplier<String > s1=()->(num%2==0)?"Even":"Odd";
        c1.accept(s1.get());
    }
}

