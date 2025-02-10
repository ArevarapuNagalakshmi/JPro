package FunctionalInterface;
interface SwapNum{
    void m1(int[] numbers);
}
public class SwapingoftwoeithLE {
    public static void main(String []args){
        int numbers[]={30,10};
        SwapNum swap=(arr)->{int temp=arr[0];arr[0]=arr[1];arr[0]=temp;};
        System.out.println("Before the swap:"+numbers[0]+ "," +numbers[1]);
        swap.m1(numbers);
        System.out.println("After the swap:"+numbers[0]+ "," +numbers[1]);
//using array in this program
    }

}
