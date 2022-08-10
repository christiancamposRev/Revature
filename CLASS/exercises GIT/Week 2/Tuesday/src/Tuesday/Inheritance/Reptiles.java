package Tuesday.Inheritance;

public class Reptiles {
    double weight;
    int teeth;
    int legs;
    String sound;
    String species;

    boolean extinct;

    public Reptiles(double weight, int teeth, int legs, String sound, String species, boolean extinct) {
        this.weight = weight;
        this.teeth = teeth;
        this.legs = legs;
        this.sound = sound;
        this.species = species;
        this.extinct = extinct;
        }

    public Reptiles() {
            this.species = "undefined";


    }

        public void speak() {
            System.out.println("The animal says: " + this.sound);
        }
        public void speak_specific() {

        System.out.println("The " + this.species + " says " + this.sound);
    }
}
