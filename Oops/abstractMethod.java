package Oops;
abstract  class S1 {
    abstract void S2();
     void m1() {
        System.out.println("Sleeping");
    }
}
class S3 extends S1{
    void S2(){
        System.out.println("Lakshmi!Lucky");
    }
}
public class abstractMethod {
    public static void main(String args[]){
         S1 s=new S3();
         s.S2();
         s.m1();
    }
}
