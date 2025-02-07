package zad_13;

import java.util.ArrayList;

public class Student implements Cloneable{
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades != null ? new ArrayList<>(grades) : new ArrayList<>(5);
    }

    public String getName() {
        return name;
    }

    2public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrade(int index, int grade) {
        if (index >= 0 && index < grades.size()) {
            grades.set(index, grade);
        } else {
            System.out.println("Invalid index.");
        }
    }


    @Override
    public Student clone() throws CloneNotSupportedException {
        Student clonedStudent = (Student) super.clone();
        clonedStudent.grades = new ArrayList<>(grades);
        return clonedStudent;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name + ": " + grades;
    }
}
