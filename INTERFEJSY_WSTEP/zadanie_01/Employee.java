package zad_01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
    String name;
    double salary;
    LocalDate employmentData;

    public Employee(String name, double salary, LocalDate employmentData) {
        this.name = name;
        this.salary = salary;
        this.employmentData = employmentData;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getEmploymentData() {
        return employmentData;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public String toString() {
        return name + " " + salary + " " + employmentData;
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A", 2500, LocalDate.now()));
        employees.add(new Employee("B", 1500, LocalDate.now()));
        employees.add(new Employee("A", 20500, LocalDate.now()));
        employees.add(new Employee("R", 17005, LocalDate.now()));
        employees.add(new Employee("B", 20500, LocalDate.now()));

        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
    }
}
