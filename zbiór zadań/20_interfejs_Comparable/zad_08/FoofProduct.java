package zad_08;

import java.time.LocalDate;
import java.util.Arrays;

public class FoofProduct implements Comparable<FoofProduct> {
    String name;
    double price;
    LocalDate expirationYear;

    public FoofProduct(String name, double price, LocalDate expirationYear) {
        this.name = name;
        this.price = price;
        this.expirationYear = expirationYear;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpirationYear() {
        return expirationYear;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + expirationYear;
    }

    @Override
    public int compareTo(FoofProduct o) {
        return expirationYear.compareTo(o.expirationYear);
    }


    public static void main(String[] args) {
        FoofProduct[] foofProducts = new FoofProduct[] {
                new FoofProduct("bread", 5.50, LocalDate.of(2025, 12, 20)),
                new FoofProduct("cream", 5.50, LocalDate.of(2026, 11, 15)),
                new FoofProduct("tea", 5.50, LocalDate.of(2023, 12, 31)),
                new FoofProduct("potato", 5.50, LocalDate.of(2027, 5, 10))
        };

        Arrays.sort(foofProducts);

        for (FoofProduct foofProduct : foofProducts) {
            System.out.println(foofProduct);
        }
    }
}
