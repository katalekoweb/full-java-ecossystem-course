public class Demo {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.model = "Lenovo Yoga";
        lap.price = 3000;

        System.out.println(lap);
    }
}

public class Laptop
{
    String model;
    int price;
}
