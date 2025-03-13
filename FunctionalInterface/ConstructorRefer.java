package FunctionalInterface;

import java.util.function.Supplier;

public class ConstructorRefer {
        ConstructorRefer(){
            System.out.println("A created");
        }
        public static void main(String args[]){
            Supplier<ConstructorRefer> s1=()->new ConstructorRefer();
            Supplier<ConstructorRefer> s2=ConstructorRefer::new;
            s1.get();
            s2.get();
        }
    }

