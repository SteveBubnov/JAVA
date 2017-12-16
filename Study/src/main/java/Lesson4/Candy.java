package Lesson4;

public abstract class Candy {
    private String name;
    private float weight;
    private float price;

    Candy(String name, float weight, float price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название = " + name + ", вес = " + weight+ " кг., цена = " + price;
    }
}
