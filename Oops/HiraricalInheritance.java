package Oops;
class Parents{
    void p1(){
        System.out.println("Parents is print");
    }

}
class Child extends Parents{
    void p2(){
        System.out.println(" Child is print");

    }

}
class Child2 extends Parents{
    void p3(){
        System.out.println("Chils2 is print");
    }
}
public class HiraricalInheritance {
    public static void main(String args[]){
        Child c=new Child();
        Child2 c2=new Child2();
        c.p1();
        c.p2();
        c2.p1();
        c2.p3();
    }
}
