package Errors;

public class DeepCopy {
    int x=30;
}
class B1 extends DeepCopy{
    public static void main(String args[]){
        DeepCopy a=new DeepCopy();
        DeepCopy a1=new DeepCopy();
        a1.x=20;
        System.out.println(a.x);

    }
}
