package zad_01;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    String name;
    double averageGrade;
    int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return name + " " + averageGrade + " " + yearOfBirth;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.averageGrade, this.averageGrade);
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Kacper",
                2.0,
                1998));
        students.add(new Student("Adam",
                3.0,
                1999));
        students.add(new Student("Michał",
                4.0,
                1999));
        students.add(new Student("Kuba",
                3.5,
                2000));
        students.add(new Student("Maciej",
                5.0,
                2005));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);
    }

}
