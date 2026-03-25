package HelloApp.UC6;

public class helloAppUC6 {
    public static void main(String[] args) {

        // If no arguments, default greeting
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";

            // Enhanced for loop to build greeting
            for (String name : args) {
                result += name + ", ";
            }

            // Remove trailing ", " using substring
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}
