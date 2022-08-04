package Thursday;

public class ArrayExample {
    public static void main(String [] args) {
        // create an array, multiple values:
        //                0        1           2
        String[] food = {"pizza", "sandwich", "burger", "smoothie", "spagetii"};

        // we can access different elements in the array:
        System.out.println(food[0]);

        // replace burger with hot dog
        food[2] = "hotdog";

        // print it out to confirm the change
        System.out.println(food[2]);

        // check out the length of an array:
        System.out.println("Length: " + food.length);

        // loop through an array:
        // notice how we start at 0 and go up to the length - 1 ( correlates to the index)
        for(int i = 0; i < food.length; i++) {
            // print out the index and the value (colon just for visuals)
            System.out.println(i + ": " + food[i]);
        }

        System.out.println("Backwards:");

        // loop through an array backwards:
        // i -- means we decrement i (subtract by 1)
        for(int i = food.length - 1; i >= 0; i --) {
            System.out.println(i + ": " + food[i]);
        }


        // i ++ vs ++ i:
        int i = 0;
        while (i < 5) {
            // if we do ++i, it actually increments first and then prints
            // vs i ++ would print first and then increment
            System.out.println(++i);
        }

        i = 5;
        while (i >= 0) {
            System.out.println(--i);
        }
    }
}
