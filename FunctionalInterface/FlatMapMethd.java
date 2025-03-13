package FunctionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FlatMapMethd {
    public static void main(String args[]){
        List<List<String>>l1= Arrays.asList(
                Arrays.asList("aaa","bbb","dede"),
                Arrays.asList("sjhd","hdhsg","sbdsh"));

        List<String>l2=l1.stream().flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
