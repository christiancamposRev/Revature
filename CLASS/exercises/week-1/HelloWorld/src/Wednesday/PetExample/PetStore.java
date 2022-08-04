package Wednesday.PetExample;

// Main is a simpler class that allows to instantiate our pets
public class PetStore {
    public static void main(String[] args) {
        System.out.println("Here is where all of our pets will be");

        // when we make a new object, we use the "new" keyword
        // Here we use the default constructor (no args) before we even defined
        // a default constructor:
        Pet pet1 = new Pet();
        // This is normally bad form, editing the properties directly
        // Later, we'll see how we can set up methods to safely interact with the variables
        pet1.name = "Ashes";
        pet1.species = "cat";
        pet1.owner = "Rory";
        pet1.eyes = 2;
        pet1.legs = 4;
        pet1.sound = "meow";

        Pet pet2 = new Pet();
        pet2.name = "Scooby Doo";
        pet2.species = "dog";
        pet2.owner = "Shaggy";
        pet2.eyes = 2;
        pet2.legs = 4;
        pet2.sound = "ruh-roh";

        System.out.println("My name is " + pet1.name);
        System.out.println("My owner is " + pet1.owner);

        System.out.println("My name is " + pet2.name);
        System.out.println(pet2.sound);

        pet1.speak();
        pet1.eat(10);
        pet2.eat(20);
        System.out.println(pet1.getLegs());

        // Creating a pet without actually assigning its variables:
        Pet pet3 = new Pet();
        pet3.speak();
        pet3.eat(4);

        // Use our parameterized constructor
        Pet pet4 = new Pet(2,4, "Garfield", "John", "Cat" ,"Meow");
        pet4.speak();
        pet4.eat(10);

    }
}
