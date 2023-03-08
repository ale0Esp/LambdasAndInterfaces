package Lesson1.mainclass;

import java.util.function.BiFunction;

public class testBifunction {
    public static void main(String[] args) {
        BiFunction<String,String,String> bi = (x,y)-> x+y;
        System.out.println(bi.apply("Hello ", "World&"));
        
    }
}
