package Lesson4;

public class BubbleGum extends Candy {
    private String colour;

    BubbleGum(String name, float weight, float price, String colour) {
        super(name, weight, price);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Жевательная резинка (" +  super.toString() + ", цвет = " + colour + " )";
    }
}
