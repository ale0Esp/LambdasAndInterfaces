package Lessons;

import domain.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import utils.ProvidesComparator;

public class ReferenceMethod {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person(1, "Ale", 12),
            new Person(4, "Ale", 14),
            new Person(6, "Pame", 15),
            new Person(3, "Jose", 45),
            new Person(1, "Laura", 23));
        ProvidesComparator pc = new ProvidesComparator();
        Collections.sort(people, pc::compareName);
        people.forEach(System.out::println);
        
//referenced method of an instance of an arbitrary object of a particular type
        //Collections.sort(people, (x,y)-> x.compareAge(y));
        Collections.sort(people, Person::compareAge);
        
//referenced Constructor        
        List<String> arrNumber = 
                Arrays.asList("22","34","56","43","23","11","345","566","43","345","79","57");
        
        //getList(arrNumber, x-> new Integer(x));
        getList(arrNumber, Integer::new).forEach(x->System.out.println(x/10));
        
    }
    
    public static List<Integer> getList(List<String> params, Function<String, Integer> f){
        List<Integer> arr = new ArrayList<>();
        params.forEach(n -> arr.add(f.apply(n)));
        return arr;
    }

}
