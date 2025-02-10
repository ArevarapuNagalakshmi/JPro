package Oops;
class D1{
    public void m1(){
        System.out.println("22222");
    }

}
class D2 extends D1{
    void m3(){
        System.out.println("1111");
    }
}
public class Override1 {
    public static void main(String args[]){
      D2 dd=new D2();
       dd.m1();
    }
}
