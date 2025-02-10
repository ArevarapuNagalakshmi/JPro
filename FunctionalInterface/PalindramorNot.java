package FunctionalInterface;

public class PalindramorNot {
    public static void main(String args[]){
        String a="madam";
       // String b="Mahi";
        StringBuffer s=new StringBuffer(a);
        String reversedStr=s.reverse().toString();
        if(a.equals(reversedStr)){
            System.out.println(a+ ": is a palindrom.");
        }else{
            System.out.println(a+ " is not a palindrom");
        }
    }
}
