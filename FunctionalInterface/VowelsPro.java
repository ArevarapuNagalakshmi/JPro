package FunctionalInterface;

public class VowelsPro {
    public static void main(String args[]){

        System.out.println(m1("Hello"));
        System.out.println(m1("Hi"));
        System.out.println(m1("sky"));
    }

    public static boolean m1(String s1){
        return s1.toLowerCase().matches(".*[aeiou]*.");

    }
}
