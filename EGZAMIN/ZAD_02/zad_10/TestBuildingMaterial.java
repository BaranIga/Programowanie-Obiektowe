package zad_10;

public class TestBuildingMaterial {
    public static void main(String[] args) {
        BuildingMaterial material1 = new BuildingMaterial("Cement", "A", 150);
        BuildingMaterial material2 = new BuildingMaterial("Wood", "B", 50);
        BuildingMaterial material3 = new BuildingMaterial("Bricks", "A", 120);
        BuildingMaterial material4 = new BuildingMaterial("Steel", "C", 90);

        System.out.println("Is sufficient quantity (material1): " + BuildingMaterial.isSufficientQuantity(material1)); // true
        System.out.println("Is sufficient quantity (material2): " + BuildingMaterial.isSufficientQuantity(material2)); // false
        System.out.println("Is sufficient quantity (material3): " + BuildingMaterial.isSufficientQuantity(material3)); // true
        System.out.println("Is sufficient quantity (material4): " + BuildingMaterial.isSufficientQuantity(material4)); // false

        System.out.println("Is sufficient quantity (material1): " + material1.isSufficientQuantity()); // true
        System.out.println("Is sufficient quantity (material2): " + material2.isSufficientQuantity()); // false
        System.out.println("Is sufficient quantity (material3): " + material3.isSufficientQuantity()); // true
        System.out.println("Is sufficient quantity (material4): " + material4.isSufficientQuantity()); // false
    }
}
