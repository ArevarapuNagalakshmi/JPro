package FunctionalInterface;
/*interface PrimeNum{
    boolean A(int n);
}
interface PrimeNum{
    boolean A(int i);
}
public class PrimeNumberwithLE {
    public static void main(String args[]) {
       PrimeNum p = (n) -> {
            if (n <= 1)
                return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;

        };
        int num = 29;
        System.out.println("Is " + num + " prime?" + p.A(num));



    }
}*/
interface Num{
    public boolean m1(int i);
}
public class PrimenumberwithLE {
    public static void main(String args[]){
        Num A=(i)->{
            if(i<=1) {
                return false;
            }
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        return false;
                    }
                }
                return true;
        };
        for(int i=2;i<=100;i++){
            if(A.m1(i)){
                System.out.print(i+ ",");
            }
        }
    }
}
