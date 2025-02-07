package K24;

import java.util.*;

public class AlgUtils {

    public static <T> Collection<T> mergeCollections(Collection<T> collection1, Collection<T> collection2) {
        List<T> mergedList = new ArrayList<>(collection1);
        for (T item : collection1) {
            if (!mergedList.contains(item)) {
                mergedList.add(item);
            }
        }
        return mergedList;
    }

    public static void main(String[] args) {
        List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee("Alice", "HR"));
        employees1.add(new Employee("Bob", "IT"));

        List<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee("Charlie", "Finance"));
        employees2.add(new Employee("Bob", "Marketing"));

        Collection<Employee> mergedEmployees = mergeCollections(employees1, employees2);
        System.out.println("Merged Employees: " + mergedEmployees);
    }
}

class Employee {
    private String name;
    private String department;

    public Employee (String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}
