package person;

public class PersonCar {
    public static void main(String[] args) {
        Person p = new Person();
        Car c = new Car();

        p.name = "顾客";
        c.brand = "奥迪";

        p.buyCar(c);
        p.drive();
        System.out.println(p.name + c.brand);
    }
}
