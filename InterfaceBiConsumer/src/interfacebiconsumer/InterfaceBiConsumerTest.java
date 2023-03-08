package interfacebiconsumer;

import java.util.function.BiConsumer;

public class InterfaceBiConsumerTest {

    public static void main(String[] args) {
        BiConsumer<Double,Double> bc = (x,y)->System.out.println(x*y);
        bc.accept(23.3, 323.4);
    }

}
