package Wednesday;

//import java.io.InputStream;
import java.util.Scanner;

public class Scanner_exercise {
    public static void main(String[] args) {
        int score; //holds test score
        int grade; //to hold a letter grade
    Scanner console = new Scanner(System.in);
        System.out.print("type your score");
        grade = console.nextInt();
        if (grade >= 90)
            System.out.println("Your grade is an A");
        else if (grade >= 80)
            System.out.println("Your grade is a B");
        else if (grade >= 70)
            System.out.println("your grade is a C");
        else if (grade >= 60)
            System.out.println("Your grade is a D");
        else
        System.out.println("Your grade is a F");
    }
}