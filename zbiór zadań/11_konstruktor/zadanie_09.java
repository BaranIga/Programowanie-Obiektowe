// Zdefiniuj klasę Employee, która posiada pola: firstName, lastName i salary. 
//Napisz konstruktor, który przyjmuje dwa argumenty (firstName i lastName), 
//oraz blok inicjujący, który ustawia wartość salary na 3000. Sprawdź, co stanie 
//się, gdy w konstruktorze spróbujesz nadpisać wartość salary.

public class Employee {

    public String firstName;
    public String lastName;
    public int salary;

    {
        this.salary = 3000;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.salary = 5000;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Bonnie", "Bennet");
        System.out.println(employee.firstName);
        System.out.println(employee.lastName);
        System.out.println(employee.salary);
    }

}
