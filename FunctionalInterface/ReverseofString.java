package FunctionalInterface;

public class ReverseofString {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = new StringBuffer(s1).reverse().toString();
        // String s2=new StringBuilder(s1).equals(s1.reverse());
        System.out.println("Reverse of a number : " + s1);
    }
}