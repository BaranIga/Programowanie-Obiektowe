public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(0, 0);

        System.out.println(point1.distance(point2));
    }
}
