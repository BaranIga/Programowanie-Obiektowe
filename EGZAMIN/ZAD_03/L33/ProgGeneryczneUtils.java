package L33;


public class ProgGeneryczneUtils {

    public static <T> int countUniqueElements(T a, T b, T c) {
        if (a == null || b == null || c == null) {
            throw new NullPointerException("Żaden z argumentów nie może być null.");
        }

        int count = 3;
        if (a.equals(b)) count--;
        if (b.equals(c)) count--;
        if (a.equals(c)) count--;

        return count;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Jan", 20);
        Student student2 = new Student("Anna", 30);
        Student student3 = new Student("Jan", 20);
        System.out.println("Liczba unikalnych elementów: " + countUniqueElements(student1, student2, student3));
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        return age == student.age;
    }
}