package Thursday;

public class Movie {
    String name;
    String director;
    int year;

    // parameterized constructor that takes in data and assigns to the instance
    public Movie(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
        // because we don't pass in a value, we have it as some sort of default value
        this.director = "unknown director";
    }

    public Movie(String name, String director) {
        this.name = name;
        this.director = director;
        this.year = 0;
    }

    // Override the toString method to make it give us what we want:
    // We use the @Override annotation to indicate that we are changing the behavior
    // The child behavior is different than the parent behavior:
    @Override
    public String toString() {
        // initialize our return value to be an empty string:
        String returnValue = "";
        // += add on to the return Value
        returnValue += "The movie is called " + this.name;
        returnValue += "\ndirected by " + this.director;
        returnValue += "\ncame out in the year " + this.year;
        return returnValue;
    }

    // override the .equals method to make sure that we are checking for value rather than reference
    @Override
    public boolean equals(Object obj) {
        // the way we can check for equality is almost counter-intuitive
        // where we check different things, and return false if they're different
        // if we make it all the way to the end, we return true

        // Before we check the values, we notice that we take in a generic Object, rather than a movie
        // so we have to do some checks to make sure that we're actually checking the right type of object
        // if we're not even comparing to a movie, there's no way they could be equal:
        if(!(obj instanceof Movie)) return false;
        // if we've made it here, that means we haven't return false and obj is an instance of movie
        // So, we have to cast it to a Movie object so we can access its variables
        Movie other = (Movie) obj;
        // now that we've casted the object to a movie object, we can check the parameters
        if(!this.name.equals(other.name)) return false;
        if(!this.director.equals(other.director)) return false;
        // since ints are primitve, we can use the reference comparison:
        if(this.year != other.year) return false;

        // if we've made it all the way to the bottom of the method, that means we haven't returned false so we can return true:
        return true;
    }

    @Override
    public int hashCode() {
        // a very simple hash function is just adding up the hash codes of the variables:
        return year + name.hashCode() + director.hashCode();
    }



}
