import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> grades = new ArrayList<>();
        grades.add(43.0);
        grades.add(90.20);
        grades.add(65.75);
        grades.add(92.0);

        Student student = new Student("Klaudia", "Zając", grades);

        System.out.println(student.averageGrades());
    }
}
