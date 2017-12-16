package Lesson4;

public class LollyPops extends Candy {
    private String taste;


    LollyPops(String name, float weight, float price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Карамель (" + super.toString() + ", вкус = " + taste + " )";
    }
}
