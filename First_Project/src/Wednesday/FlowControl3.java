 package Wednesday;

        import java.util.Scanner;

public class FlowControl3 {
    public static void main(String[] args) {
        System.out.println("Welcome to SoloLearn. Enter a choice.");
        System.out.println("1 - View Lessons");
        System.out.println("2 - Take Challenge");
        System.out.println("3 - Chat");
        System.out.println("4 - View Discussions");
        System.out.println("5 - Online Challenge");

        Scanner scanner = new Scanner(System.in);
        System.out.print("=>");

        int choice = scanner.nextInt();

        // check the value of the variable choice:
        switch(choice) {
            // in the case that choice is 1, run this code:
            case 1:
                System.out.println("Here are the lessons");
                System.out.println("Python");
                System.out.println("Java");
                System.out.println("C++");
                // we use the break keyword to make sure we don't "fall into" the other cases
                break;
            // in the case that choice is 2, run this code:
            case 2:
                System.out.println("Here are the challenges");
                System.out.println("BFS Challenge");
                System.out.println("DFS Challenge");
                System.out.println("Recursion Challenge");
                break;
            case 3:
                System.out.println("Now chatting with a friend");
                break;
            case 4:
                System.out.println("Here are the discussions");
                break;
            case 5:
                System.out.println("Please wait for online match-making");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }

        char c = 'a';
        switch(c) {
            case 'a':
                System.out.println("apple");
                break;
            case 'b':
                System.out.println("banana");
        }

        String name = "mike";
        switch(name) {
            case "mike":
                System.out.println("Your name is Mike");
        }


    }
}