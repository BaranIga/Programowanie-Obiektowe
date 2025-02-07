package najprosztsza_wersja_01;

public class TestHospital {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("City Hospital", 100);
        Hospital hospital2 = new Hospital("City Hospital", 100);
        Hospital hospital3 = new Hospital("County Hospital", 150);
        Clinic clinic1 = new Clinic("City Clinic", 50, 4.5);
        Clinic clinic2 = new Clinic("City Clinic", 50, 4.5);

        System.out.println("hospital1.equals(hospital2): " + hospital1.equals(hospital2)); // true
        System.out.println("hospital1.equals(hospital3): " + hospital1.equals(hospital3)); // false
        System.out.println("clinic1.equals(clinic2): " + clinic1.equals(clinic2)); // true
        System.out.println("clinic1.equals(hospital1): " + clinic1.equals(hospital1)); // false
        System.out.println("hospital3.equals(clinic2): " + hospital3.equals(clinic2)); // false

        System.out.println(hospital2);
        System.out.println(clinic1);

    }
}
