public class Main {
    public static void main(String[]args) {

        Pokemon p1 = new Pokemon();

        p1.name = "pikachu";
        p1.level = 10;
        p1.type = " electric ";

        System.out.println( p1.name + " " + p1.level + p1.type);

        Pokemon p2 = new Pokemon();
        p2.name = "charmander";
        p2.level = 15;
        p2.type = " fire ";
        p2. attack();

        System.out.println( p2.name + " " + p2.level + p2.type);

        Pokemon p3 = new Pokemon();
        p3.name = "bulbasaur";
        p3.level = 7;
        p3.type = " grass ";

        System.out.println( p3.name + " " + p3.level + p3.type);

        Pokemon p4 = new Pokemon();
        p4.name = "squirtle";
        p4.level = 10;
        p4.type = " water ";
        p4.attack();

        System.out.println( p4.name + " " + p4.level + p4.type);

        Pokemon p5 = new Pokemon();
        p5.name = "snorlax";
        p5.level = 25;
        p5.type = " normal ";
        p5.rest();

        System.out.println( p5.name + " " + p5.level + p5.type);
    }
}
