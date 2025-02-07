package K12;

public class EchoUtils {

    public static <T> void echoIfEquivalent(T a, T b, T c) {
        if (a.equals(b) && b.equals(c)) {
            System.out.println("Wszystkie trzy są równoważne");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("jan", 20);
        Student student2 = new Student("jan", 20);
        Student student3 = new Student("jan", 20);

        echoIfEquivalent(student1, student2, student3);

    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return this.age == student.age;
    }
}
