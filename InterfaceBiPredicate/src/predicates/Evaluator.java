package predicates;

import domain.Employeer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluator {
    public List<Employeer> evalue(List<Employeer> empList, BiPredicate<Integer,String> bp){
        List<Employeer> empListNew = new ArrayList<>();
        for (Employeer emp : empList) {
            if(bp.test(emp.getAge(), emp.getDepartment()))
                empListNew.add(emp);
        }
        return empListNew;
    }
}
