package Leeson1.TestPredicare;

import domain.Employeer;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import predicates.Evaluator;

public class MainClassOne {

    public static void main(String[] args) {
        List<Employeer> empList = Arrays.asList(
                new Employeer("Josue", 19, 1200.0, "DBT"),
                new Employeer("Ale", 30, 2333.0, "OM"),
                new Employeer("Dany", 29, 4444.0, "PM"),
                new Employeer("Fanny", 29, 4444.0, "GA"),
                new Employeer("Dany", 29, 4444.0, "GA"),
                new Employeer("Dany", 29, 4444.0, "PM"),
                new Employeer("Rodirgo", 28, 5555.0, "DBT"),
                new Employeer("Juan", 22, 6666.0, "SFC"));

    }

    public void bpTestOr(List<Employeer> empList) {
        BiPredicate<Integer, String> bpC1 = (x, y) -> (x > 25) && (y.equals("DBT"));
        BiPredicate<Integer, String> bpC2 = (x, y) -> (x > 25) && (y.equals("PM"));
        BiPredicate<Integer, String> c = bpC1.or(bpC2);
        Evaluator eva = new Evaluator();
        List<Employeer> empListNew = eva.evalue(empList, c);
        System.out.println("Employeer DBT OR PM Older than 25 years");
        for (Employeer employeer : empListNew) {
            System.out.println(employeer);
        }
    }

    public void testBP() {
        BiPredicate<Integer, Integer> bp = (x, y) -> x < y;
        if (bp.test(7, 5)) {
            System.out.println("Trye");
        }
    }
}
