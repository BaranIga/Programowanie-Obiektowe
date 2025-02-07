package zad_02;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Adam", new int[]{1, 2, 3, 4, 5});
        Student student2 = null;
        try {
            student2 = student1.clone();
            System.out.println(student1);
            System.out.println(student2);
            student1.changeFirstGrade(10);
            System.out.println(student1);
        } catch (CloneNotSupportedException e) {
            e.getMessage();
        }
    }
}
