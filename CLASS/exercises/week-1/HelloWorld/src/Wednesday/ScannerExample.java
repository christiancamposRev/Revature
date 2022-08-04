package Wednesday;

// we have to import classes when we use them
// we're specifying that we're using this Scanner from the java.util package
import java.util.Scanner;


public class ScannerExample {
    // Reminder, main method is the entry point for our program
    public static void main(String[] args) {
        // type,name      // we use the new keyword whenever we create an instance of an object
        Scanner scannerNumber = new Scanner(System.in); //System.in means we're reading data from the command line

        // Give a prompt for the user:
        System.out.print("Enter number of pizzas => ");

        // nextInt takes what we write in the console and store it in the left side
        int numPizzas = scannerNumber.nextInt();

        System.out.println(numPizzas + " pizzas for the party.");

        Scanner scannerString = new Scanner(System.in);
        System.out.print("Enter topping => ");
        // scanner.nextLine lets us grab strings from the console:
        String topping1 = scannerString.nextLine();
        System.out.println("Topping 1: " + topping1);

        System.out.print("Enter topping => ");
        String topping2 = scannerString.nextLine();
        System.out.println("Topping 2: " + topping2);

        System.out.print("Enter weight of pizza => ");
        double weight = scannerNumber.nextDouble();
        System.out.println("Weight: " + weight);


    }

    public static void test() {
        System.out.println("This is a new method");
    }
}
