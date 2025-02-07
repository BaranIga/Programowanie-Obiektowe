package K34;

public class AssessmentUtils {

    public static <T> void signalIfNotEqual(T a, T b, T c) {
        if (!a.equals(b) || !b.equals(c) || !a.equals(c)) {
            System.out.println("Co najmniej jeden jest różny");
        }
    }


    public static void main(String[] args) {
        Course course = new Course("math", 1234);
        Course course1 = new Course("english", 134);
        Course course2 = new Course("history", 1324);

        signalIfNotEqual(course, course1, course2);
    }
}

class Course {
    String subject;
    int code;

    Course(String subject, int code) {
        this.subject = subject;
        this.code = code;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Course course = (Course) obj;

        return code == course.code;
    }
}