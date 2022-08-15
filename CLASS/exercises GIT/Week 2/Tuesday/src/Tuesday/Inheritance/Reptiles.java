package Tuesday.Inheritance;

import java.security.PrivateKey;

public class Reptiles {
    public static boolean Encapsulate;
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
            System.out.println("The Reptile says: " + this.sound);
        }
        public void speak_specific() {

        System.out.println("The " + this.species + " says " + this.sound);

    }
    static class Encapsulate {

        private double weight;
        private int teeth;
        private int legs;
        private String sound;
        private String species;
        private boolean extinct;

        public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getTeeth() {
        return teeth;
    }
    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    private boolean isExtinct() {
        return extinct;
    }
    public void setExtinct(boolean extinct) {
        if( extinct = true) {
            this.extinct = true;
        }
    }   Encapsulate Reptiles = new Encapsulate();
    }
}