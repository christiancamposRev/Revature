package Wednesday.PetExample;

// This class represents a Pet
// This is a representation of a physical being
public class Pet{
    // define some variables, properties, traits
    int eyes;
    int legs;
    String sound;
    String species;
    String name;
    String owner;

    // Methods:

    // Constructors:
    // default constructor (no arguments):
    public Pet() {
        // since we have no values being passed in, we can just set up some default values:
        this.name = "default name";
        this.sound = "default sound";
        this.owner = "default owner";
        this.species = "default species";
        this.eyes = 2;
        this.legs = 4;
    }

    // another constructor, this time with parameters (input)
    public Pet(int eyes, int legs, String name, String owner, String species, String sound) {
        // in the body, we take the parameters and assign them to the instance:
        this.eyes = eyes;
        this.legs = legs;
        this.name = name;
        this.owner = owner;
        this.species = species;
        this.sound = sound;
    }




    // we add void to this method declaration because it doesn't return anything
    void speak() {
        System.out.println(this.sound);
    }

    // here we specify int because we are returning an integer value:
    int getLegs() {
        return this.legs;
    }

    // we pass in an amount of the pet eats that much food:
    void eat(int weight) {
        System.out.println(this.name + " ate " + weight + " ounces of food");
    }



}
