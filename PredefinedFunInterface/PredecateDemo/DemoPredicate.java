package PredefinedFunInterface.PredecateDemo;

import java.util.function.Predicate;

public class DemoPredicate {
   public static void main(String args[]){
       Predicate<Integer> p= (i)->i>10;
       System.out.println(p.test(5));
       System.out.println(p.test(15));
   }
}
