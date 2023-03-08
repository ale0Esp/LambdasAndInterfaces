package Control;

import domain.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentOperations {
    public List<Student> evalueAccept(List<Student> listEval, Consumer<Student> c){
        List<Student> listAccept = new ArrayList<>();
        for (Student student : listEval) {
            c.accept(student);
        }
        return listAccept;
    }
}
