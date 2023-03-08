package lesson1.main;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> c = x -> System.out.println(x.toUpperCase());
        c.accept("hello");
    }
}
