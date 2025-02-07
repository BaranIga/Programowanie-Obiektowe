package zad_01;

public interface Vehicle {

    void startEngine(String fuelType);

    boolean canDrive(int fuelLevel);

    default void stop() {
        System.out.println("pojazd zatrzymany");
    }

    default void honk() {
        System.out.println("pi pi pi");
    }

    static String info() {
        return "jest to interfejs vehicle";
    }

}
