package Oops;
interface P1{
    void m1();
}
class Q implements P1{
    //@Override
    public void m1() {
        System.out.println("QQQQQ");
    }
}
public class AbstractInterface {
    public static void main(String args[]){
        Q q=new Q();
        q.m1();
    }
}
