package zad_02;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    String name;
    double salary;
    LocalDate employmentDate;

    public Employee(String name, double salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    @Override
    public String toString() {
        return name + " " + salary + " " + employmentDate;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }


    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kasia", 5500.50, LocalDate.now()));
        employees.add(new Employee("Adam", 6000, LocalDate.now()));
        employees.add(new Employee("Maria", 20000, LocalDate.now()));
        employees.add(new Employee("Marek", 14000, LocalDate.now()));
        employees.add(new Employee("Joanna", 7500, LocalDate.now()));

        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);

    }
}
