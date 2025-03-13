package FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class MethodRefer {
    //static void m1(String Message){
   public void m1(String Message){
        System.out.println(Message);
    }
    public static void main(String args[]){
      /*  List<String> l1= Arrays.asList("Hello","Hi","Heee");
        l1.forEach(mgs->FlatmapMesg.m1(mgs));
        l1.forEach(FlatmapMesg::m1);*/
        MethodRefer f=new MethodRefer();
        List<String> l1= Arrays.asList("Hello","Hi","Heee");
      l1.forEach(msg->f.m1(msg));
      l1.forEach(f::m1);
    }
}
