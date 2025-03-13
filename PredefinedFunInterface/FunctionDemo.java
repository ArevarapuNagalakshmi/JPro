package PredefinedFunInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String args[]){
        Function<String,Integer>f=(name)->name.length();
        System.out.println(f.apply("GMMMM"));
        System.out.println(f.apply("nbcvdgshfc"));
        System.out.println(f.apply("Gjfhud"));
    }
}
