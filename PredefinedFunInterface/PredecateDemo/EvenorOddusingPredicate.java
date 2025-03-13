package PredefinedFunInterface.PredecateDemo;

import java.util.function.Predicate;

public class EvenorOddusingPredicate {
    public static void main(String args[]){
        Predicate<Integer> p=(n)->n%2==0;
        for(int i=1;i<=10;i++){
            if(p.test(i)){
                System.out.println(i+ " : p is Even Number");
            }else{
                System.out.println(i+ " : p is Odd number");
            }
        }
    }
}
