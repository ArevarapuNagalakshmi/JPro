package FunctionalInterface;

public class PrimeNumber {
    public static boolean m1(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int number=29;
        System.out.println(m1(number));

    }
}
/*package referencelambda.eightthirty;

public class prime {
    public static void main(String[] args){
        System.out.println("Prime numbers up to 100:");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+", ");
            }
        }
    }
}*/
