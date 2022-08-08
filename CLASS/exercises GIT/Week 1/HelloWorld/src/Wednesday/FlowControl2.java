package Wednesday;

import java.util.Scanner;

public class FlowControl2 {
    public static void main(String[] args) {
        int height_requirement = 50;
        Scanner scanner = new Scanner(System.in);
        // while true will always run
        while(true) {
            System.out.print("Enter height => ");
            int height = scanner.nextInt();
            // if we don't meet the height requirement, then we continue or skip this person
            if(height < height_requirement) {
                // continue in this case, will move on to the next person (skipping the rest of this step, moving on to the rest of the loop)
                continue;
            }
            // otherwise, move on with this person because they can ride the ride
            System.out.println("Enjoy your ride!");
        }

    }
}
