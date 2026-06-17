class Demo
{
    public static void main (String args[]) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();

        obj1.show();
    }
}

class Mobile 
{
    String brand;
    int price;
    static String name;

    static
    {
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile () 
    {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show () {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

class Calculator
{
    int num = 10; // instance variable - this vars are on stack memory

    public int add (int n1, int n2)
    {
        int result = n1+n2;
        return result;
    }

    public int add (int n1, int n2, int n3)
    {
        // System.out.println(num);
        int result = n1+n2+n3;
        return result;
    }
}

class Computer
{
    public void playMusic () {
        System.out.println("Music Playing...");
    }

    public String getMeAPen (double cost) {
        if (cost >= 10)
            return "Pen";

        return "Nothing";
    }
}

class Human 
{
    // Encapsulation
    
    private int age; 
    // private ony in the same class
    private String name = "Julian";

    public Human () // default contructor
    {
        age = 31;
        name = "Julian";
    }

    public Human(String name) {
        this.name = name;
    }

    public Human (int a, String n) // parameterized constructor 
    {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

// Object Oriented Programmin
// Object - Properties and behaviors
// we need classes to implement OOP
// JDK - used to compile the java code that is converted to byte code