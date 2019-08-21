package L14_Object_and_Classes;

public class Dice {
    private int sides;
    private String type;

    public Dice(){
        this.sides = 5;
        this.type = "A";
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
