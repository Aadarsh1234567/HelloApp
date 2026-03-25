package HelloApp.UC4;

public class helloAppUC4 {
    public static void main(String[] args) {
        
        // If no arguments, default to "World"
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Loop through all names
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    
}
}
