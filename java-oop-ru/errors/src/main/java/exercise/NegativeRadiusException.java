package exercise;

// BEGIN
public class NegativeRadiusException extends Exception {
    public NegativeRadiusException(String message) {
        super(message);
    }

    public  NegativeRadiusException() {
        super("Радиус не может быть отрицательным!");
    }
}
// END
