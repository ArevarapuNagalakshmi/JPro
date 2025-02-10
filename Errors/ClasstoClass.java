package Errors;

public class ClasstoClass {
        public class A {
           // static
            void m1() {
                System.out.println("Hello");
            }
        }

        public static void main(String args[]) {
            ClasstoClass c= new ClasstoClass();
            A a = c.new A();
            a.m1();
        }
    }


