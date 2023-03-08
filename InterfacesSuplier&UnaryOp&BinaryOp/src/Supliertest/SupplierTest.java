package Supliertest;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> sp = ()-> "Hello Wolrd";
        System.out.println("sp = " + sp.get());
    }
}
