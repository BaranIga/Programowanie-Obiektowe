//Stwórz klasę Circle z prywatnym polem radius. Dodaj konstruktor, który przyjmuje 
//promień jako argument. Dodaj metody dostępowe (gettery i settery) oraz metody 
//area() i circumference(), które obliczają pole powierzchni i obwód koła.


public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }


    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println(circle.circumference());
    }
}
