package Lesson2.main;

import domain.Employeer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculator {

    public String calc(BiFunction<Integer, Integer, String> bf, Integer i1, Integer i2) {
        return bf.apply(i1, i2);
    }

    public List<Double> calc(BiFunction<Double, Double, Double> bf,
            List<Employeer> employeers, Double increment) {
        List<Double> salaryList = new ArrayList<>();
        for (Employeer emp : employeers) {
            salaryList.add(bf.apply(emp.getSalary(), increment));
        }
        return salaryList;
    }
}
