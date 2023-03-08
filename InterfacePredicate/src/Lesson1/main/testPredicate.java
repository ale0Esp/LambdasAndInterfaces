
package Lesson1.main;

import java.util.function.Predicate;

public class testPredicate {
    public static void main(String[] args) {
            Predicate<Integer> pre = (x)-> x>0;
            if(pre.test(123))
                System.out.println("true");
    }
}
