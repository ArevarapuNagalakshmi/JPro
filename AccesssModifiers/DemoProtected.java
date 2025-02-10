package AccesssModifiers;
class A1{
    protected int A=100;
    protected  void m1(){
        System.out.println("A:"+A);
    }
}
class B1 extends A1{
    void m2(){
        m1();
    }
}
public class DemoProtected {
  public static void main(String args[]){

    }
}
