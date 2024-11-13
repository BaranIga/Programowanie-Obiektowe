//Stwórz klasę Employee z prywatnymi polami: firstName, lastName, position, 
//age oraz salary. Dodaj konstruktor, który przyjmuje wszystkie pola jako argumenty. 
//Dodaj metody dostępowe (gettery i settery)
//oraz metodę showInformation(), która wyświetla informacje o pracowniku.


public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName, String position, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInformation() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Position: " + position);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }


    public static void main(String[] args) {
        Employee employee = new Employee("Katarzyna", "Bocian", "teacher", 30, 4500.25);
        employee.showInformation();
    }
}
