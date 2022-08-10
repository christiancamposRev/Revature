package Tuesday.Inheritance;

public class Pteradactyl extends Dinosaurs{

    String behavior;

    public Pteradactyl(String aggressive) {
        this.weight = 10 ;
        this.teeth = 110;
        this.legs = 2;
        this. sound = "bill clacked";
        this.species = "Pterosaur";
        this.warmBlooded = "yes";
        this.behavior = "non-aggressive";
}

{
    }

    @Override
    public String toString() {
        return "Pteradactyl{" +
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
