package K32;

import java.util.*;

public class FilterUtils {

    public static <T> void  filterUnique(Collection<T> items) {
        List<T> uniques = new ArrayList<>();
        List<T> duplicates = new ArrayList<>();

        for (T item : items) {
            if (uniques.contains(item)) {
                duplicates.add(item);
            } else {
                uniques.add(item);
            }
        }

        items.clear();

        for (T item : uniques) {
            if (!duplicates.contains(item)) {
                items.add(item);
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Math"));
        students.add(new Student("Bob", "Physics"));
        students.add(new Student("Alice", "Biology"));
        students.add(new Student("Charlie", "Chemistry"));
        students.add(new Student("David", "Physics"));
        System.out.println("Before filtering: \n" + students);
        filterUnique(students);
        System.out.println("After filtering: \n" + students);
    }
}

class Student {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', course='" + course + "'}";
    }
}