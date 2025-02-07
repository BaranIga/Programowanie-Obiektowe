package K14;

public class FruitUtils {

    public static <T extends Comparable<T>> T firstMinValue(T[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null ani pusta.");
        }

        T min = tab[0];

        for (T elem : tab) {
            if (elem.compareTo(min) < 0) {
                min = elem;
            }
        }

        return min;
    }


    public static void main(String[] args) {
        Fruit[] fruits = {
                new Fruit("Apple", 5.0),
                new Fruit("Banana", 3.5),
                new Fruit("Orange", 4.0)
        };

        System.out.println("Pierwszy najmniejszy owoc: " + firstMinValue(fruits));
    }
}

class Fruit implements Comparable<Fruit> {
    String name;
    double sweetness;

    Fruit(String name, double sweetness) {
        this.name = name;
        this.sweetness = sweetness;
    }

    @Override
    public int compareTo(Fruit o) {
        return Double.compare(this.sweetness, o.sweetness);
    }

    @Override
    public String toString() {
        return name + " (" + sweetness + ")";
    }
}