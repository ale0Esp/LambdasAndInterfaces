
package Lesson2.implemnets;

import domain.Employeer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluator {
    public List<Employeer> evalue(List<Employeer> listEmp, Predicate<Employeer> pre){
        List<Employeer> newList = new ArrayList<>();
        for (Employeer employeer : listEmp) {
            if(pre.test(employeer)){
                newList.add(employeer);
            }
        }
        return newList;
    }
    
        public List<Employeer> evalueNot(List<Employeer> listEmp, Predicate<Employeer> pre){
        List<Employeer> newList = new ArrayList<>();
        for (Employeer employeer : listEmp) {
            if(pre.negate().test(employeer)){
                newList.add(employeer);
            }
        }
        return newList;
    }
        
}
