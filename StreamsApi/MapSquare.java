package StreamsApi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapSquare {
    public static void main(String args[]){
       // int i;
        List<Integer> num= Arrays.asList(1,2,3,4,5,6);
        List<Integer>Square=num.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(Square);
    }
}
