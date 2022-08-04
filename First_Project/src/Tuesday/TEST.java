package Tuesday;

// Class name are capitalized
//example : String is a class, so it is capitalized
public class TEST {
    // this is a comment, we an write about our code
    // this is our main method, or our entry point into the program
    // psvm is a shortcut for ( public static void main(String[] args) { )
    public static void main(String[] args) {
        //system.out -> print out to the console
        //println -> Print the string with a new line
        // sout is a shortcut (system.out.print)
        System.out.println("Hello World");
        System.out.println(4);
        System.out.println(5*9);

        //lets create some primitive values
        //these are variables
        //each variable has a type
        //only need to declare it once, and then you can reassign it
        int grade = 50;
        //we can change variables
        grade = 100;
        byte battling = 30;
        long credit_score = 1000;
        short a =23;
        //decimal numbers
        //doubles can store more precision than a float
        //float : 7 digits for precision, double; 15 digits for precision

        double degree = 45.67;
        //take double and cast to a float
        //casting means we change the type
        float gpa = (float) 3.0001;
        float gpa2 = 3.5f;

        //booleans: (only 2 possible values)
        grade = 80;
        //check the grade gainst a benchmark:
        boolean passed_test = grade >= 65;
        boolean failed_test = grade< 65;
        System.out.println(passed_test);
        boolean raining = false;
        boolean sunny = true;

        char first_initial = 'r';
        char last_initial = 'e';

        // what is the difference here?
        System.out.println(4+5); // 9
        System.out.println("4" + "5"); // 2,45,4+5

        System.out.println('4'+'5');
        //this will actually add the ascii codes, giving us 105

        System.out.println((int) '4');
        System.out.println((int) '5');
        //casting a character to int will convert it to ascii values which might not  be what we want

        //operators
        System.out.println(4+5);
        System.out.println(5-4);
        System.out.println(5*4);
        System.out.println(100/5);


        //gives the remainder of 10 divided by 6
        System.out.println(10 % 6);
        //check if a number is even/odd
        // == means we check if hey are equal
        System.out.println(20%2 ==0); //true
        System.out.println(21%2 ==0); // false
        //check if odd
        System.out.println(35 % 2 ==1); // remainder of division by 2 is 1


        //boolean operators
        System.out.println(false); // not true == false
        System.out.println(true); //not false == true

        // and means both must be true
        // If we think of the end operator as a requirements to get on a roller coaster
        //we know that both have to be true for the final to be true
        System.out.println("Boolean Operators: (And)");
        System.out.println(true); //true
        System.out.println(false); //false
        System.out.println(false); // false
        System.out.println(false); //false

        System.out.println("Booleab Operator (Or)");
        //only needs to be true
        //think of someone asking you to bring dinner or desert to a party (assume they're OK with both)
        System.out.println(true);
        System.out.println(true);
        System.out.println(true);
        System.out.println(false);

        //inequlity operators
        int grade1 = grade;
        int i = 70;
        int benchmark =65;
        //greater than or equal to:
        System.out.println(grade >= benchmark);
        //less than or equal to
        System.out.println(grade >= benchmark);



    }
}

