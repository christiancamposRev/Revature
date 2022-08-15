package Tuesday.Inheritance;

public class Main {
    public static void main(String[] args) {
        Reptiles crocodile = new Reptiles(1200, 65, 4, "bellows", "Crocodylidae",false);
        Reptiles flying_lizard = new Reptiles(0.73,15, 4, "hissing" ,"Agamidae",false);

        crocodile.speak();
        flying_lizard.speak();

        crocodile.speak_specific();
        flying_lizard.speak_specific();

        Dinosaurs lizard = new Dinosaurs();
        System.out.println(flying_lizard.species);

        Dinosaurs triceratops = new Dinosaurs(18000, 800, 4, "grumble", "Ceratopsidae", "yes");

        triceratops.speak();
        triceratops.speak_specific();

        triceratops.Dinosaurs_only();

        TREX TREX = new TREX ("yes");
        System.out.println(TREX.toString());

        Pteradactyl Pteradactyl = new Pteradactyl("no");
        System.out.println( Pteradactyl.toString());


        }


    }

// 2. At least one class must exemplify encapsulation, preferably all of them
//    - All fields are private
//    - Public getters and setters