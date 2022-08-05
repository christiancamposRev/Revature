public class Pokemon {
    String type;
    String name;
    int level;

    void attack() {
        System.out.println(name + " attack ");

    }

    void rest() {
        System.out.println(name + " rest ");
    }


    public void Pokemon(String type, String name, int level) {
        this.type = "type";
        this.name = name;
        this.level = level;
    }

    public void Pokemon(String type, String name) {
        this.type = type;
        this.name = name;
        this.level = 0;
    }

    @Override
    public String toString() {
        String returnValue = "";
        returnValue += "The Pokemon is called " + this.name;
        returnValue += "\ntype by " + this.type;
        returnValue += "\nlevel by " + this.level;
        return returnValue;
    }
}