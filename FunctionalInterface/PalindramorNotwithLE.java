package FunctionalInterface;
interface Palindram{
    void m1(String s);
}
public class PalindramorNotwithLE {
    public static void main(String args[]){
        Palindram p=(s)->{
            StringBuffer s1=new StringBuffer(s);
            String reversedStr=s1.reverse().toString();
            if(s.equals(reversedStr)){
                System.out.println(s+ ": is a palindrom.");
            }else{
                System.out.println(s+ " is not a palindrom");
            }
        };
        p.m1("hello");
    }
}
