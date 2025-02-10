package Statements;

public class DescendingOrderthreenum {
    public static void main(String args[]){
                int a=10; int b=5;int c=100;
                if(a<b){
                    int temp=a;
                    a=b;
                    b=temp;
                }
                if(a<c){
                    int temp=a;
                    a=c;
                    c=temp;
                }
                if(b<c){
                    int temp=b;
                    b=c;
                    c=temp;
                }
                System.out.println(" After To print the Descnding Order :" +a+ ","+b+ "," +c);
            }
        }

