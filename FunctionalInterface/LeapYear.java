package FunctionalInterface;

public class LeapYear {
    public static void main(String args[]){
       /* int a=2004;
        if((a%4==0 && a%100!=0)|| (a%4==0)){
            System.out.println(a+ "is a leap year");
        }else{
            System.out.println(a+ "is a leap year");
        }*/
        int a=2000;
        int b=2026;
        System.out.println("leap year "  +a+   "to"   +b+  ":");
        for(int i=a;i<=b;i++){
            if((i%4==0 && i%100!=0)||(i%400==0)){
                System.out.println(i+ "is a leap year");
            }
            System.out.println(i+ "is not a leap year");
        }
    }
}
