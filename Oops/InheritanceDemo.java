package Oops;
class A1{
   void m1(){
        System.out.println("A1 is a class");
    }
}
class Boy extends A1{
    void m2(){
       System.out.println("Boy is a class");
   }
}
public class InheritanceDemo {
   public static void main(String args[]){
      Boy b=new Boy();
        b.m1();
        b.m2();

    }
}
