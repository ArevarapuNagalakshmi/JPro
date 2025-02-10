package Statements;

public class AscendingOrderthreenum {
    public static void main(String args[]){
        int a=10; int b=5;int c=1;
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(a>c){
            int temp=a;
            a=c;
            c=temp;
        }
        if(b>c){
            int temp=b;
            b=c;
            c=temp;
        }
        System.out.println(" After To print the Ascending Order :" +a+ ","+b+ "," +c);
    }
}
