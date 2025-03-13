package PredefinedFunInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Emp{
     String Name;
     String Location;
     String Dept;
     Emp(String Name, String Location, String Dept) {
       this.Name=Name;
       this.Location=Location;
       this.Dept=Dept;
     }

 }
public class PredicateJoining {
     public static void main(String args[]){
         Emp e1=new Emp("AAAAA","Chenni","Java");
         Emp e2=new Emp("BBBBB","Hyd","Python");
         Emp e3=new Emp("AAA","Bng","C++");
         Emp e4=new Emp("DDDDD","Ap","Fuul stack");
         List<Emp> e= Arrays.asList(e1,e2,e3,e4);
         Predicate<Emp>p1=ep->e1.Name.equals("AAAA");
         Predicate<Emp>p2=ep->e2.Location.equals("Chenni");
         Predicate<Emp>p3=ep->e3.Dept.equals("Java");
        Predicate<Emp> p=p1.and(p2).and(p3);
        Predicate<Emp> pp=p1.or(p2);
         for(Emp ep:e){
             if (pp.test(ep));{
                 System.out.println(ep.Name);
                //System.out.println(ep.Location);
                // System.out.println(ep.Dept);
             }
         }
     }
}
