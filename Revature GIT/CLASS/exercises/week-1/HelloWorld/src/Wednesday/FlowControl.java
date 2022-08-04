package Wednesday;

import java.util.Scanner;

public class FlowControl {
    public static void main(String [] args) {
        // we have to be 60 inches or taller to ride the roller coaster
        int height = 70;
        int age = 20;
        int threshold = 60;

        // condition in ()
        // what happens based on that condition goes in {}
        if(height > threshold) {
            // notice the indendation, everything in this if-block is pushed a little more
            System.out.println("You can ride the roller coaster");
        }
        else if(age >= 18) {
            System.out.println("You're an adult, ride at your own risk.");
        }
        // if none of the conditions trigger, then the else statement will
        else {
            System.out.println("You cannot ride the roller coaster");
        }

        // imagine we don't have an else statement
        if(height > threshold) {
            System.out.println("You can ride.");
        }
        // if we can't do else, we have to take the opposite of the previous if-statement
        if (height <= threshold) {
            System.out.println("You can't ride.");
        }

        // we can us boolean operators to ensure 2 conditions are true before the code is executed
        if(age >= 18 && height > threshold) {
            System.out.println("You are perfectly safe");
        }

        // Let's say we want to count to 10 in our code:
        // why is this bad code?
        // DRY - Don't Repeat Yourself
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        int counter = 1;
        // while our counter is less than 11:
        while(counter < 101) {
            // loop body, this is what executes at every iteration
            // in this case, we print out counter at every step:
            System.out.println(counter);
            // update counter
            // we take the value of counter, add 1 to it, and assign it back to the variable counter:
            // counter = counter + 1;
            // counter += 1;
            // this is the shortest way to increment a variable, just keep in mind that it adds exactly 1
            counter ++;
        }

        // While loops don't have to be numeric, they can rely on user input, etc.
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        // loop while the boolean variable flag is true
        while(flag) {
            System.out.println("Enter an animal");
            String animal = scanner.nextLine();
            System.out.println(animal);
            // checking to see if the animal we pass in is an aardvark
            // contains checks if the first string contains the second string inside
            if(animal.contains("aardvark")) {
                // if so, we set the flag to be false which will then break the loop
                flag = false;
            }
        }
        System.out.println("Congratulations! \nYou guessed the correct animal!");


        System.out.println("For Loop: ");
        // if we have a numeric loop, it's easier to write it as a for-loop:
        for(int i = 0; i < 20; i ++) {
            // loop body, this will execute every time
            System.out.println(i);
        }

        // special loop statements
        for(int i = 0; i < 10; i ++) {
            // loop body, this happens with every iteration
            if(i % 2 == 0) {
                System.out.println("Even!");
                // continue means skip the rest of this iteration and move on to the next
                 continue;
            }
            // if we reach this code, that means we didn't "continue", so this will print out just the odd numbers
            System.out.println(i);
        }

        // break:
        for(int i = 0; i < 20; i ++) {
            // if we encounter an unlucky number, cut our losses and quit the loop entirely
            if (i == 13) {
                // break will exit the loop entirely, not just skip the next iteration
                break;
            }
            System.out.println(i);
        }

        // nested for loops:
        for(int i = 0; i < 10; i ++) {
            // we have to use a different counter for the inner loop
            for(int j = 0; j < 10; j ++) {
                System.out.println("i " + i + " j " + j);
                if(j == 7) {
                    // only breaks the current loop:
                    break;
                }
            }
        }


    }
}
