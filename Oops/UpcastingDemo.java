package Oops;
class A3 {
    void m1() {
        System.out.println("Hello");
    }
}
    class B extends A3{
        void m2(){
            System.out.println("Hii");
        }
    }

public class UpcastingDemo {
    public static void main(String args[]){
        A3 aa=new B();
        aa.m1();
    }

}
