package functions;

import domain.Diner;
import java.util.function.Function;

public class DataDiner {
    
    public static void main(String[] args) {
        Diner d =  new Diner("Alesp",233.0,2);
        String nameDi = (String)getDataDiner(d,x->  x.getName());
        System.out.println("name Diner = " + nameDi);
        int table = (int) getDataDiner(d,x->  x.getNumTable());
        System.out.println("Tabñe Diner = " + table);
    }
    public static Object getDataDiner(Diner d, Function<Diner, Object> f){
        return f.apply(d);
    }
}
