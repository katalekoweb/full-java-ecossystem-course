class Demo
{
    public static void main (String args[]) {
        Human obj1 = new Human(31, "Kataleko");
        Human obj2 = new Human(3, "Alana");
        // obj.setAge(31);
        // obj.setName("Julian");
        // obj.age = 11;
        // obj.name = "Julian Kataleko";
        
        System.out.println(obj1.getName() + ": " + obj1.getAge());
        System.out.println(obj2.getName() + ": " + obj2.getAge());
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