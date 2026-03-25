package HelloApp.UC5;

public class helloAppUC5 {
    public static void main(String[] args) {

        // If no arguments, greet "World"
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced for loop to process multiple names
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}
