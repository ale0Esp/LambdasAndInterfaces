package lessonStudent.main;

import Control.StudentOperations;
import domain.Student;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainClass {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ale", 69.0),
                new Student("Daniel", 89.0),
                new Student("Josue", 99.0),
                new Student("Pamela", 129.0),
                new Student("Laura", 34.0),
                new Student("Jaqueline", 55.0),
                new Student("Kath", 99.0));

        StudentOperations op = new StudentOperations();
        Consumer<Student> c1 = (x) -> System.out.println(x);
        Consumer<Student> c2 = x -> x.setScore(x.getScore() + 12.0);
        System.out.println("old Score");
        op.evalueAccept(students, c1);
//        op.evalueAccept(students, c2);
        System.out.println("\nNew score");
//        op.evalueAccept(students, c1);
        Consumer<Student> c3 = c2.andThen(c1);
        op.evalueAccept(students, c3);

    }
}
