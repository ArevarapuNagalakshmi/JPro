package FunctionalInterface;
public class Localclass {
   public void m1() {
        System.out.println("Hello");
        class B {
            void m2() {
            System.out.println("Hiii");
        }
    }
    B b= new B();
        b.m2();
   }
    public static void main(String args[]){
        Localclass l=new Localclass();
        l.m1();


    }
}
