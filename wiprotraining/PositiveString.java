package wiprotraining;

import java.util.Scanner;

public class PositiveString{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("Enter a string to check if it is a positive string (or type 'exit' to quit): ");
            String inputString = scanner.nextLine();

            
            if (inputString.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            
            boolean isPositive = isPositiveString(inputString);

            
            if (isPositive) {
                System.out.println("The string \"" + inputString + "\" is a positive string.");
            } else {
                System.out.println("The string \"" + inputString + "\" is not a positive string.");
            }
        }

       
        scanner.close();
    }

    
    public static boolean isPositiveString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
