package Oops;
class P{
    void m1(){
        System.out.println("P is print");
    }
}
class Q1 extends P{
    void m2(){
        System.out.println("Q is print");
    }
}
class R extends Q1{
    void m3(){
        System.out.println("R is print ");
    }
}
public class MultilevelInheritance {
    public static void main(String args[]){
           R r=new R();
           r.m1();
           r.m2();
           r.m3();
    }
}
