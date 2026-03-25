package HelloApp.UC7;

public class helloAppUC7 {
    public static void main(String[] args) {

        // If no arguments, default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join names with comma and space
            String names = String.join(", ", args);

            System.out.println("Hello, " + names + "!");
        }
    }
}
