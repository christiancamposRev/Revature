package Tuesday.Inheritance;

public class TREX extends Dinosaurs {

    String behavior;

    public TREX(String aggressive) {
        // super(weight, teeth, legs, sound, species,warmBlooded);
            this.weight = 15500 ;
            this.teeth = 60;
            this.legs = 2;
            this. sound = "RAWR";
            this.species = "Tyrannosaurus";
            this.warmBlooded = "yes";
            this.behavior = "aggressive";

    }

    @Override
    public String toString() {
        return "TREX{" +
                "behavior='" + behavior + '\'' +
                ", warmBlooded='" + warmBlooded + '\'' +
                ", weight=" + weight +
                ", teeth=" + teeth +
                ", legs=" + legs +
                ", sound='" + sound + '\'' +
                ", species='" + species + '\'' +
                ", extinct=" + !extinct +
                '}';
    }
}
