public class Employee extends Person{

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void displayData() {
        System.out.println("FirstName: " + getFirstName());
        System.out.println("LastName: " + getLastName());
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Elena", "Gilbert");
        employee.displayData();
    }
}
