package Lessons;

import comparators.Compare;
import domain.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ale","Pame","Jose","Laura");
        System.out.println("Lisy wthin oder: " +names);
        Collections.sort(names);
        System.out.println("List w order"+ names);
        List<Person> people = Arrays.asList(
                                new Person(1,"Ale",12),
                                new Person(4,"Ale",14),
                                new Person(6,"Pame",15),
                                new Person(3,"Jose",45),
                                new Person(1,"Laura",23));
        //Compare comp = new Compare();
        //Collections.sort(people, x);
       
        Collections.sort(people, (p1,p2)-> p1.getId()-p2.getId());
        Collections.sort(people, Person::compareTo);
        people.forEach(x->System.out.println(x));
    }
    
    
}
