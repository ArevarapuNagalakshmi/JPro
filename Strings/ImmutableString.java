package Strings;

public class ImmutableString {
    public static void main(String args[]){
        String s="Hello";
        s.concat("World");//does not modify s,create a new string
        System.out.println(s);
        s=s.concat("World");
        System.out.println(s);
    }
}
