import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
    String imie;
    double sredniaOcen;
    int rokUrodzenia;

    public Student(String imie, double sredniaOcen, int rokUrodzenia) {
        this.imie = imie;
        this.sredniaOcen = sredniaOcen;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public String toString() {
        return imie + " " + sredniaOcen + " " + rokUrodzenia;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Adam",
                4.0,
                1998));
        students.add(new Student("Adam",
                3.0,
                1999));
        students.add(new Student("Adam",
                4.0,
                1999));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        // students.sort();

    }

    @Override
    public int compareTo(Student o) {
        // sortowanie jest rosnące
        // > 0 = liczba dod. or < 0 = liczba ujem. or = 0 = 0
        /* if (this.sredniaOcen > o.sredniaOcen) {
            return 1;
        }
        else if (this.sredniaOcen < o.sredniaOcen) {
            return -1;
        }
        else {
            return 0;
        }
        zgadza się to z return Double.compare...
        */

        return Double.compare(this.sredniaOcen, o.sredniaOcen);

        /*
        if(Double.compare(this.sredniaOcen, o.sredniaOcen) == 0) {
            return Integer.compare(o.rokUrodzenia, this.rokUrodzenia)
        }
        else {
            return Double.compare(this.sredniaOcen, o.sredniaOcen;
        }
        */

    }
}
