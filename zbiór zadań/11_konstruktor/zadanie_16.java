//Stwórz klasę Rectangle z prywatnymi polami width i height. Dodaj konstruktor, 
//który przyjmuje długości boków jako argumenty. Dodaj metody dostępowe (gettery 
//i settery) oraz metody area() i perimeter(), które obliczają pole powierzchni i 
//obwód prostokąta.


public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.3, 7.7);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
