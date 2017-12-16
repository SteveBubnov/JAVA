package Lesson4;

public class JellyBeans extends Candy {
private String size;

    JellyBeans(String name, float weight, float price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Желейные конфеты (" + super.toString() + ", размер = " + size + " )";
    }
}

