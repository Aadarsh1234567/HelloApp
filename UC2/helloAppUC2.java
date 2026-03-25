package HelloApp.UC2;

public class helloAppUC2 {
     public static void main(String[] args) {
        
        // Check if a name is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("No name provided. Please pass your name as a command-line argument.");
        }
    }
}
