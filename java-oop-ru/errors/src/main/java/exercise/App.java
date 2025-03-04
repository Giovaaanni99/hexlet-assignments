package exercise;

// BEGIN
class App {
    public static void printSquare(Circle circle) {
        try {
            double area = circle.getSquare();
            System.out.println((int) Math.round(area));
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }

    }
}
// END
