import java.util.List;

public record Student(String firstName, String lastName, List<Double> grades) {
    public double averageGrades() {
        if(grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (int i=0; i < grades.size(); i++) {
            sum += i;
        }

        return sum/grades.size();
    }
}
