package FunctionalInterface;

public class CalsumofSequence {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print(i+"+");
            sum=sum+i;
        }
        System.out.println("="+sum);

    }
}
