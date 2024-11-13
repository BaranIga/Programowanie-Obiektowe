//Zdefiniuj klasę Phone, która ma pola: manufacturer, model i operatingSystem.
//W bloku inicjującym ustaw wartość operatingSystem na Android. Następnie napisz 
//konstruktor, który przyjmuje dwa argumenty (manufacturer i model) i próbuje
//nadpisać wartość operatingSystem na iOS. Sprawdź, która wartość zostanie ostatecznie 
//przypisana do pola operatingSystem.

public class Phone {

    public String manufacturer;
    public String model;
    public String operatingSystem;

    {
        operatingSystem = "Android";
    }

    public Phone(String manufacturer, String  model) {
        this.manufacturer = manufacturer;
        this.model = model;

        this.operatingSystem = "iOS";
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Nokia", "black");
        System.out.println(phone.manufacturer);
        System.out.println(phone.model);
        System.out.println(phone.operatingSystem);
    }

}
