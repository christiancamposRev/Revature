package Tuesday;

// Class names are capitalized
// example: String is a class, so it is capitalized
public class HelloWorld {
    // this is a comment, we can write about our code
    // this is our main method, or our entry point into the program
    // we will look into "public" "static", in time, but for now just remember this is how
    // we set up our main method
    // (psvm is a shortcut)
    // this is a method, not a class
    public static void main(String [] args) {
        // System.out -> print to the console
        // println -> print the string with a new line
        // (sout is a shortcut)
        System.out.println("Hello World");
        System.out.println(4);
        System.out.println(5*9);

        // let's create some primitive values:
        // these are variables
        // each variable has a type, name, value
        // only need to declare the type once and then you can reassign the value whenever you want:
        int grade = 50;
        // we can change variables
        grade = 100;
        byte batting = 30;
        long credit_score = 1000;
        short a = 23;

        // decimal numbers
        // doubles can store more precision than a float
        // float: 7 digits for precision, double ; 15 digits for precision

        double degree = 45.67;
        // take double and cast to a float
        // casting means we change the type

        float gpa = (float) 3.0001;
        float gpa2 = 3.5f;

        // booleans: (only 2 possible values)
        grade = 80;
        // check the grade against a benchmark:
        boolean passed_test = grade >= 65;
        boolean failed_test = grade < 65;
        System.out.println(passed_test);
        boolean raining = false;
        boolean sunny = true;

        // unlike Strings, we use single quotes for characters
        char first_initial = 'r';
        char last_initial = 'e';

        // what is the difference here?
        System.out.println(4 + 5); // 9
        // string concatenation:
        System.out.println("4" + "5"); // 45

        // this will actually add the ascii codes, giving us 105
        System.out.println('4' + '5');

        // casting from character to int will convert it to ascii values which might not be what we want
        System.out.println((int)'4');
        System.out.println((int)'5');

        // operators
        // these work like how you would see them in math
        System.out.println(4 + 5);
        System.out.println(5 - 4);
        System.out.println(5 * 4);
        System.out.println(100 / 5);

        // gives the remainder of 10 divided by 6
        System.out.println(10 % 6);
        // check if a number is even/odd:
        // == means we check if they are equal
        System.out.println(20%2 == 0); // true
        System.out.println(21%2 == 0); // false
        // check if odd:
        System.out.println(35 % 2 == 1); // remainder of division by 2 is 1

        // boolean operators
        System.out.println(!true); // not true == false
        System.out.println(!false); // not false == true

        // and means both must be true
        System.out.println("Boolean Operators: (And)");
        // If we think of the and operator as requirements to get on a roller coaster
        // we know that both have to be true for the final expression to be true
        boolean over5 = true;
        boolean over15 = true;
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println("Boolean Operators: (Or)");
        // only one needs to be true
        // think of someone asking you to bring dinner or desert to a party (assume they're okay with both)
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false


        System.out.println("Inequality Operators:");
        // inequality operators:
        grade = 70;
        int benchmark = 65;
        // greater than or equal to:
        System.out.println(grade >= benchmark);
        // less than or equal to:
        System.out.println(grade <= benchmark);
        // equal to:
        System.out.println(grade == benchmark);
        // greater than:
        System.out.println(grade > benchmark);
        // less than:
        System.out.println(grade < benchmark);

    }
}
