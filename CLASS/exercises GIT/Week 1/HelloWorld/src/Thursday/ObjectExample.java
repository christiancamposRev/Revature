package Thursday;

public class ObjectExample {
    public static void main(String [] args) {
        Movie movie1 = new Movie("Jurassic Park", "Spielberg", 1993);
        Movie movie2 = new Movie("Titanic", "Cameron", 1997);
        Movie movie3 = new Movie("Hook", 1991);
        Movie movie4 = new Movie("Jurassic Park", "Spielberg", 1993);
        Movie movie5 = new Movie("Titanic", "Cameron");

        // Because every class descends from the object class, we know it will have toString
        // By default, the toString method doesn't give us much information (package, class, mem address)
        String movieString = movie1.toString();
        System.out.println(movieString);

        System.out.println(movie3.toString());

        // check if movie1 is equal to movie2
        System.out.println("Jurassic Park to Titanic: " + movie1.equals(movie2));
        System.out.println("Hook to itself: " + movie3.equals(movie3));
        // Before we override the .equals method, we don't get the intended behavior
        System.out.println("Jurassic Park to Jurassic Park: " + movie1.equals(movie4));
        System.out.println("Titanic to Titanic(no year): " + movie2.equals(movie5));
        // we can pass in a string to .equals and it should return false
        System.out.println("Movie to non-movie: " + movie3.equals("string value"));

        // this will print out the class: we probably don't want to override:
        System.out.println(movie1.getClass());

        // print out the hash value of movie:
        System.out.println(movie1.hashCode());
        System.out.println(movie1.hashCode());
        // different object, so different hash codes:
        System.out.println(movie2.hashCode());

        // we can use hashcode to check equality:
        System.out.println(movie1.hashCode() == movie4.hashCode());
    }
}
