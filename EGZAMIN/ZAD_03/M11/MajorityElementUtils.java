package M11;

import java.util.Objects;

public class MajorityElementUtils {

    public static <T> boolean majorityElement(T a, T b, T c) {
        return a.equals(b) || b.equals(c) || a.equals(c);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Apple", 1.0);
        Product product2 = new Product("Banana", 2.0);
        Product product3 = new Product("Apple", 1.0);
        System.out.println("Czy co najmniej dwa elementy są równe? " + majorityElement(product1, product2, product3));    }
}

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return name.equals(product.name);
    }
}