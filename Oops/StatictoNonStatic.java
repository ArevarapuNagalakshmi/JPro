package Oops;
///Non Static method cannot be declared from a static context
/*class C1{
    static void m1(){
        System.out.println("22222");
        mx();
        System.out.println("3333");
    }
    void mx(){
        System.out.println("6666666666");
    }
}*/

// static method to call the non-static method
class BA{
  static void m1(){
    System.out.println("333");

  }
 void m2(){
   m1();
    System.out.println("44444");
}
        }
public class StatictoNonStatic {
    public static void main(String args[]){

      // A.m1();
        BA.m1();



    }
}
