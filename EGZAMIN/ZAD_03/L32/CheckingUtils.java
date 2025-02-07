package L32;

public class CheckingUtils {

    public static <T extends Comparable<T>> boolean isArraySorted(T[] tab) {
        if (tab == null) {
            throw new NullPointerException("Żaden z argumentów nie może być null.");
        }

        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] == null || tab[i + 1] == null) {
                throw new NullPointerException("Tablica zawiera null");
            }
            if (tab[i].compareTo(tab[i + 1]) > 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("Produkt A", 10.5),
                new Product("Produkt B", 15.0),
                new Product("Produkt C", 20.0)
        };

        System.out.println(isArraySorted(products));

        Product[] products2 = {
                new Product("Produkt A", 10.5),
                new Product("Produkt C", 20.0),
                new Product("Produkt B", 15.0)
        };

        System.out.println(isArraySorted(products2));
    }
}

class Product implements Comparable<Product> {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }
}
