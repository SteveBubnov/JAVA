package Lesson4;

public class Present {
    public static void main(String[] args) {
        JellyBeans jellyBeans = new JellyBeans("Щарики", 2.15f, 22, "Большой");
        LollyPops lollyPops = new LollyPops("Полёт", 5.84f, 30, "Лимон");
        LollyPops lollyPops1 = new LollyPops("Тархун", 1.5f, 10, "Тархун");
        ChocolateBar chocolateBar = new ChocolateBar("Батончик", 4,40.5f, "Карамель и нуга");
        BubbleGum bubbleGum = new BubbleGum("Надувной лес", 0.33f, 5, "Красный");
        float sumWeight = 0;
        float sumPrice = 0;

        Candy[] presents = {jellyBeans, lollyPops, lollyPops1, chocolateBar, bubbleGum};
        for (Candy someCandy:presents) {
            sumWeight = sumWeight + someCandy.getWeight();
            sumPrice = sumPrice + someCandy.getPrice();
            System.out.println(someCandy.toString());
        }
        System.out.println("Вес подарка = " + sumWeight + " кг." + "\nЦена подарка = " + sumPrice);
    }
}
