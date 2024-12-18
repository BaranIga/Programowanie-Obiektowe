import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }


    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "Laptop", 150.00));
        products.add(new Product(2, "Mouse", 25.10));
        products.add(new Product(5, "Laptop", 300.50));
        products.add(new Product(1, "Headphones", 150.00));
        products.add(new Product(6, "Monitor", 25000.00));

        products.sort(new ProductComparator());

        System.out.println(products);
    }
}

class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.price, o2.price);
    }
}
