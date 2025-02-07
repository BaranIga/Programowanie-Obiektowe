package zad_02;

import java.util.Arrays;

public class Student implements Cloneable {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades != null ? grades.clone() : new int[5];
    }

    @Override
    public String toString() {
        return name + " " + Arrays.toString(grades);
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        clone.grades = grades.clone();
        return clone;
    }

    public void changeFirstGrade(int newGrade) {
        grades[0] = newGrade;
    }
}
