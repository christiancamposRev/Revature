package Wednesday;

public class FlowControl {
    public static void main(String[] args) {
        // System.out.println("Hello");

        //we have to be 60 inches or taller to ride the roller coaster
        int height = 50;
        int threshold = 60;
        int age = 20;
        int threshold = 60;

        if (height < threshold) {
            //Notice indendation, everything in this if-block is pushed a little more
            System.out.println("You can ride the roller coaster");
        } else if (age >= 18)
            System.out.println("You cannot ride the roller coaster");
        }
            //imagine we don't have an else statement
            if (height > threshold) {
                System.out.println( "You can ride.");
        }
    }


}