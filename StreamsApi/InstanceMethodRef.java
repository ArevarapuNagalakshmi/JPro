package StreamsApi;

public class InstanceMethodRef {
    public void m1() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
        public static void main(String args[]){
            InstanceMethodRef a=new InstanceMethodRef();
            Runnable r=a::m1;
            Thread t=new Thread(r);
            t.start();
    }
}
