package test;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        Function<Integer, String> converter = x-> Integer.toString(x);
        System.out.println(converter.apply(40).length());
        System.out.println(converter.apply(4).length());
    }
}
//Mehod aply
//
// Function<Integer, String> anon = new Function<Integer, String>(){
//            @Override
//            public String apply(Integer t) {
//              return Interger.toString(t)
//            }
//        };
        
