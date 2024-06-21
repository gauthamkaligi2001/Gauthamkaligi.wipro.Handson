package wiprotraining;
import java.util.Scanner;

public class Stringoper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("\nString Operations Menu:");
            System.out.println("1. Add the String to itself");
            System.out.println("2. Replace odd positions with #");
            System.out.println("3. Remove duplicate characters in the String");
            System.out.println("4. Change odd characters to upper case");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

         
            int choice = scanner.nextInt();
            scanner.nextLine(); 

         
            if (choice == 5) {
                System.out.println("Exiting the program...");
                break;
            }

           
            System.out.print("Enter the string: ");
            String inputString = scanner.nextLine();

           
            switch (choice) {
                case 1:
                    System.out.println("Result: " + addStringToItself(inputString));
                    break;
                case 2:
                    System.out.println("Result: " + replaceOddPositionsWithHash(inputString));
                    break;
                case 3:
                    System.out.println("Result: " + removeDuplicateCharacters(inputString));
                    break;
                case 4:
                    System.out.println("Result: " + changeOddCharactersToUpperCase(inputString));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        
        scanner.close();
    }

   
    public static String addStringToItself(String s) {
        return s + s;
    }

    
    public static String replaceOddPositionsWithHash(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result += "#";
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

   
    public static String removeDuplicateCharacters(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }

  
    public static String changeOddCharactersToUpperCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                result += Character.toUpperCase(s.charAt(i));
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }
}
