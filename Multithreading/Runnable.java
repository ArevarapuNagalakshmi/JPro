package Multithreading;

public class Runnable {
    public static class ThreadEx extends Thread{
       public void run(){
            int a=10;
            int b=20;
            System.out.println("Thread is riunning");
            System.out.println(a+b);
        }
    }
    public static void main(String args[]){
        ThreadEx t=new ThreadEx();
        t.start();

    }
}
