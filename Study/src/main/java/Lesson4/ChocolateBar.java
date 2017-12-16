package Lesson4;

public class ChocolateBar extends Candy {
    private String filling;

    ChocolateBar(String name, float weight, float price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Шоколадный батончик (" + super.toString() + ", начинка = " + filling + " )";
    }
}
