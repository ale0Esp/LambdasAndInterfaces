package main;

import Lesson2.implemnets.Evaluator;
import Lesson2.implemnets.Functions;
import domain.Employeer;
import java.util.Arrays;
import java.util.List;

public class LessonMain {

    Evaluator eval = new Evaluator();
    
    List<Employeer> empList = Arrays.asList(
            new Employeer("Josue", 19, 1200.0, "DBT"),
            new Employeer("Ale", 30, 2333.0, "OM"),
            new Employeer("Dany", 29, 4444.0, "PM"),
            new Employeer("Rodirgo", 18, 5555.0, "MASTER"),
            new Employeer("Juan", 22, 6666.0, "MASTER3"));
    

    public static void main(String[] args) {
        LessonMain ls= new LessonMain();
        Functions f = new Functions();
        List<Employeer> use;
        use = ls.yougsEmp();
        for (Employeer emp : use) {
            double newSalary = f.incrementSalary(emp, 10,
                    (x,y)-> x+(x*y));
            emp.setSalary(newSalary);
        }
        ls.print(use,"Increment for young employeers");
        
        ls.oldEmp();
    }

    public void salary() {
        List<Employeer> lisSalary = eval.evalue(empList, x -> x.getSalary() > 2500);
        String ms = "Employeer w salary > 2500";
        print(lisSalary,ms);
    }

    public void namestarts() {
        String ms = "Employer with de initial letter in the  name is  j";
        List<Employeer> listNameWJ = eval.evalue(empList, x -> x.getName().startsWith("J"));
        print(listNameWJ,ms);
    }

    public List<Employeer> yougsEmp() {
        String ms = "Yungs Employers";
        List<Employeer> listEmp = eval.evalue(empList, x -> x.getAge() < 25);
        print(listEmp,ms);
        return listEmp;
    }
    public List<Employeer> oldEmp() {
        String ms = "old Employers";
        List<Employeer> listEmpY = eval.evalueNot(empList, x -> x.getAge() < 25);
        print(listEmpY,ms);
        return listEmpY;
    }

    public void print(List<Employeer> emplList, String message) {
        System.out.println("\n"+message);
        for (Employeer emp : emplList) {
            System.out.println(emp);
        }
    }
}
