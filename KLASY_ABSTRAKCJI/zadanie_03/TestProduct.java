import java.util.ArrayList;

public class TestProduct {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Book());
        products.add(new Book());
        products.add(new Book());
        products.add(new Clothing());
        products.add(new Clothing());

        for (Product product : products) {
            System.out.println(product.getPrice());
        }
    }
}
