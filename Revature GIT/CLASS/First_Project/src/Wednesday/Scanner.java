package Wednesday;

import java.util.Scanner;

public class ScannerExample {
    //reminder, main method is the entry point for our program
    public static void main(String[] args) {
        //type, name    //we use the new keyword whenever we create an instance of an object
        Scanner scanner = new Scanner(System.in); //System.in means we're reading data from the command line
        Scanner

        //Give a prompt for the user
        System.out.println("Enter the number of pizzas =>");
        //nextInt takes what we write in the console and store it in the left side
        int NumPizzas = scanner.nextInt();

        System.out.println(NumPizzas + "pizzas for the party");

        Scanner scannerString = new Scanner(System.in);
        System.out.print("Enter topping => ");
        //scanner.nextline lets us grab strings from the console:
        String topping1 = scanner.nextLine();
        System.out.println("Topping 1" + topping1);

        System.out.print ("enter number of pizza => ");
        double weight =  Scannernumber.nextDouble();
        System.out.println ("Weight:" + weight);


    }

    public static void test() }