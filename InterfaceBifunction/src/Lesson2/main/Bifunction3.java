package Lesson2.main;

import domain.Employeer;
import java.util.Arrays;
import java.util.List;

public class Bifunction3 {
    public static void main(String[] args) {
        List<Employeer> employeerList = Arrays.asList(
                new Employeer("jose",2323),
                new Employeer("jose",3434),
                new Employeer("jose",5454),
                new Employeer("jose",7878));
        
        Calculator cal = new Calculator();
        List<Double> salarys = cal.calc((x,y)->x+(x*(y/100)), employeerList, 10.0);
        for (Double salary : salarys) {
            System.out.println("salary increment= " + salary);
        }
    }
}
