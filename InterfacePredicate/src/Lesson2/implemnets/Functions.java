package Lesson2.implemnets;

import domain.Employeer;
import java.util.function.BiFunction;


public class Functions {
    public Double incrementSalary(Employeer emp, double increment, BiFunction<Double,Double,Double> bf){
        return bf.apply(emp.getSalary(), (increment/100));
    }
}
