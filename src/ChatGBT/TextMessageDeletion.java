package ChatGBT;

import java.util.ArrayList;
import java.util.Scanner;

public class TextMessageDeletion {
   // import java.util.ArrayList;
//import java.util.Scanner;

   // public class TextMessageDeletion {
        public static void main(String[] args) {
            ArrayList<String> textMessages = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            // Add some initial text messages for demonstration purposes
            textMessages.add("Hi there!");
            textMessages.add("How are you?");
            textMessages.add("Remember to buy groceries.");
            textMessages.add("See you at the party!");

            // Display the initial list of text messages
            System.out.println("Current text messages:");
            for (String message : textMessages) {
                System.out.println(message);
            }

            // Ask the user which message to delete
            System.out.print("Enter the index of the message to delete: ");
            int indexToDelete = scanner.nextInt();

            // Check if the index is valid
            if (indexToDelete >= 0 && indexToDelete < textMessages.size()) {
                textMessages.remove(indexToDelete);
                System.out.println("Message deleted successfully!");
            } else {
                System.out.println("Invalid index. No message deleted.");
            }

            // Display the updated list of text messages
            System.out.println("\nUpdated text messages:");
            for (String message : textMessages) {
                System.out.println(message);
            }

            scanner.close();
        }
    }


