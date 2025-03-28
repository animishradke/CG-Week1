public class ExceptionHandlingExample {

    public static void causeNullPointerException() {
        String text = null;
        System.out.println("Length: " + text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException exception) {
            System.out.println("Caught NullPointerException: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Generating Exception ----");
        try {
            causeNullPointerException();
        } catch (NullPointerException exception) {
            System.out.println("Handled in main: " + exception.getMessage());
        }

        System.out.println("\n---- Handling Exception ----");
        handleNullPointerException();
    }
}