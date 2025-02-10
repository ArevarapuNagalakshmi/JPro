package FunctionalInterface;

import java.util.function.Function;

public class Demofunction {
    public static void main(String args[]){
        Function<String,Integer> lengthofstring=str->str.length();
        //Function<String,Integer> lengthofinteger=Integer->Integer.length();
        System.out.println(lengthofstring.apply("JavaProgram"));
        System.out.println(lengthofstring.apply("PythonPro"));
    }
}
