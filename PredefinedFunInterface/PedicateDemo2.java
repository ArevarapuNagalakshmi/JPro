package PredefinedFunInterface;

import java.util.function.Predicate;

public class PedicateDemo2 {
    public static void main(String args[]){
        String names[]={"Hari","Mani","Haritha","Siva"};
        Predicate<String> p= name ->name.charAt(0)=='A';
        for(String name:names){
            if(p.test(name)){
                System.out.print(name);
            }
            System.out.println();
        }
    }
}
