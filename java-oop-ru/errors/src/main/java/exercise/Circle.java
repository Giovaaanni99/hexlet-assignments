package exercise;

// BEGIN
class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Радиус не может быть отрицательным!");

        }
        double square = Math.PI * (radius * radius);
        return square;
    }

    public int getRadius() {
        return radius;
    }
}
// END
