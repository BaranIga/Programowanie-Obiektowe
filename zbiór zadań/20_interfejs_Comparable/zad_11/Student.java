package zad_11;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    String name;
    double averageGrades;
    int yearOfStudy;

    public Student(String name, double averageGrades, int yearOfStudy) {
        this.name = name;
        this.averageGrades = averageGrades;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrades() {
        return averageGrades;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public String toString() {
        return name + " " + averageGrades + " " + yearOfStudy;
    }

    @Override
    public int compareTo(Student o) {
        if (this.averageGrades != o.averageGrades) {
            return Double.compare(o.averageGrades, this.averageGrades);
        }
        return Integer.compare(this.yearOfStudy, o.yearOfStudy);

    }


    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Ania", 4.75, 2024),
                new Student("Kasia", 2.80, 2023),
                new Student("Andrzej", 3.50, 2022),
                new Student("Ewa", 4.00, 2024)
        };

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }


}
