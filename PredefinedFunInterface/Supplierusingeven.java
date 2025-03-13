package PredefinedFunInterface;

import java.util.function.Supplier;


public class Supplierusingeven {
    public static void main(String args[]){
        int i=8;
        Supplier<String> s=()->((i%2==0)?"Given number is even" : "Given number is odd");
        System.out.println(s.get());

    }
}
