package PredefinedFunInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String args[]) {
        Supplier<LocalDateTime> DTS = () -> LocalDateTime.now();
        System.out.println("Current Date & Time: " + DTS.get());
    }
}
