package zad_15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product> {
    String name;
    double price;
    LocalDate expirationDate;

    public Product(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + expirationDate;
    }

    @Override
    public int compareTo(Product o) {
        if (this.expirationDate != o.expirationDate) {
            return o.expirationDate.compareTo(this.expirationDate);
        }
        return Double.compare(this.price, o.price);
    }


    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk", 2.50, LocalDate.of(2024, 1, 10)));
        products.add(new Product("Bread", 1.20, LocalDate.of(2024, 1, 5)));
        products.add(new Product("Cheese", 5.00, LocalDate.of(2024, 1, 10)));
        products.add(new Product("Butter", 3.00, LocalDate.of(2024, 1, 8)));

        Collections.sort(products);

        for (Product product : products) {
            System.out.println(product);
        }
    }


}
