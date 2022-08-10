package Tuesday.Inheritance;

public class Dinosaurs extends Reptiles {
    String warmBlooded;

    public Dinosaurs(double weight, int teeth, int legs, String sound, String species, String warmBlooded) {
        super(weight, teeth, legs, sound, species,true);
        this.warmBlooded = warmBlooded;

    }
    public Dinosaurs() {

        super();
    }
    @Override
    public void speak() {
        super.speak();
        System.out.println("The Dinosaur says: " + this.sound);

    }

    public void Dinosaurs_only() {
        System.out.println("This method only applies to Dinosaurs");
        System.out.println(super.extinct);
    }
}