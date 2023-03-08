package utils;

import domain.Person;

public class ProvidesComparator {
    public int compareName(Person p1, Person p2){
        return (int) p1.getName().compareTo(p2.getName());
    }
    public int compareAge(Person p1, Person p2){
        return (int) p1.getAge().compareTo(p2.getAge());
    }
}
