package Errors;

public class ShallowCopy {
    int x = 20;
}
    class B extends ShallowCopy{
        public static void main(String args[]){
            ShallowCopy a=new ShallowCopy();
            ShallowCopy a1=a;
           a1.x=10;
           System.out.println(a.x);
        }
    }

