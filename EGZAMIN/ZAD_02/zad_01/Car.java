package zad_01;

public class Car implements Vehicle {

    @Override
    public void startEngine(String fuelType) {
        if (fuelType.equalsIgnoreCase("benzyna") || fuelType.equalsIgnoreCase("diesel")) {
            System.out.println("Silnik uruchomiony z użyciem " + fuelType);
        } else {
            System.out.println("Nieznany typ paliwa");
        }

    }

    @Override
    public boolean canDrive(int fuelLevel) {
        return fuelLevel > 5;
    }
}
