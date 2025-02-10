package AccesssModifiers;
class A2{
    void m1(){
        System.out.println("A2 is a m1");
    }
}
public class DemoDefault {
    public static void main(String args[]){
        A2 a=new A2();
        a.m1();
    }
}
