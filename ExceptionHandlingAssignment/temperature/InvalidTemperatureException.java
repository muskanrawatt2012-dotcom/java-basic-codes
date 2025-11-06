package ExceptionHandlingAssignment.temperature;

public class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}
