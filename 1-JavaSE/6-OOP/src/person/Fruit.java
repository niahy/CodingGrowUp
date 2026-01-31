package person;

public class Fruit {
    String name;
    String color;
    double weight;
    double price;

    public static void deductPrice(Fruit fruit){
        fruit.price = fruit.price * 0.8;
        System.out.println( "打八折后：" + fruit.price );
    }
}
