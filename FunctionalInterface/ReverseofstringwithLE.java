package FunctionalInterface;
interface Reverses{
    public void m1(String str);

}
public class ReverseofstringwithLE {
    public static void main(String args[]){
      Reverses R=(str)->{
          System.out.println("Reverse of a number : " +str);
          String s2=new StringBuffer(str).reverse().toString();
          System.out.println("Reverse of a number : " +s2);
      };
      R.m1("Hello");
    }
}

