//Stwórz klasę Point2D z prywatnymi polami x i y, reprezentującymi współrzędne 
//punktu na płaszczyźnie. Dodaj konstruktor, który przyjmuje współrzędne jako 
//argumenty. Dodaj metody dostępowe (gettery i settery) oraz metodę
//distance(Point2D anotherPoint), która oblicza odległość między dwoma punktami na 
//płaszczyźnie.


public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point2D anotherPoint) {
        double dx = this.x - anotherPoint.getX();
        double dy = this.y - anotherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Point2D point2D_01 = new Point2D(6.25, 8.75);
        Point2D point2D_02 = new Point2D(15, 1.25);
        double distance = point2D_01.distance(point2D_02);
        System.out.println(distance);
    }
}
