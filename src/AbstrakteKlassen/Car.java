package AbstrakteKlassen;

public class Car implements Moveable {

   private String type;
   private String color;
   private int weight;

    public Car(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(color + " " + type + " will be moved to " + destination);
    }


}
