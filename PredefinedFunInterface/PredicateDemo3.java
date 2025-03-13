package PredefinedFunInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class P{
    String name;
    int age;
   P(String name,int age){
      this.name=name;
      this.age=age;
   }
}
public class PredicateDemo3 {
    public static void main(String args[]) {
        P p1 = new P("Hari", 20);
        P p2 = new P("Mahi", 30);
        P p3 = new P("Pavi", 18);
        P p4 = new P("Joi", 14);
        List<P> p = Arrays.asList(p1, p2, p3, p4);
        Predicate<P> predicate = P -> p1.age >= 18;
        for (P person : p) {
             if(predicate.test(person)){
                 System.out.println(person.name);
             }

        }
    }
}
