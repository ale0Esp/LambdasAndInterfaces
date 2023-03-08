package unaryOptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        List<Integer> intLis = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> listUp = unaryOp(x->x*x, intLis);
        listUp.forEach(x-> System.out.println(x
        ));
        
    }
    public static List<Integer> unaryOp(UnaryOperator<Integer> ListUO,List<Integer> list){
        List<Integer> updateList = new ArrayList<>();
        list.forEach((x)->updateList.add(ListUO.apply(x)));
        return updateList;
    }
}
