import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    public class arraylist {
        public static void main (String[] args) {

            List<Integer> number = new ArrayList <>(
                    Arrays.asList ( 0,10,20,30,40,50,60,70,80,90,100));

            System.out.println("order of given list:");

            System.out.println(number);

            System.out.println("Reverse order of given List : ");

            Collections.reverse(number);

            System.out.println(number);

        }
    }

