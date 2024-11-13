//twórz klasę Student z prywatnymi polami: firstName, lastName, indexNumber, 
//yearOfStudy oraz gradeAverage. Dodaj konstruktor, który przyjmuje wszystkie
//pola jako argumenty. Dodaj metody dostępowe (gettery i settery) oraz metodę 
//showInformation(), która wyświetla informacje o studencie.


public class Student {

    private String firstName;
    private String lastName;
    private int indexNumber;
    private int yearOfStudy;
    private double gradeAverage;

    public Student(String firstName, String lastName, int indexNumber, int yearOfStudy, double gradeAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.yearOfStudy = yearOfStudy;
        this.gradeAverage = gradeAverage;
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

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public void showInformation() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Index Number: " + indexNumber);
        System.out.println("Year of Study: " + yearOfStudy);
        System.out.println("Grade Average: " + gradeAverage);
    }


    public static void main(String[] args) {
        Student student = new Student("Agnieszka", "Kot", 153248, 2, 4.56);
        student.showInformation();
    }
}
