class Demo
{
    public static void main (String args[]) {
        // Computer computer = new Computer();
        // computer.playMusic();
        // String pen = computer.getMeAPen(12.5);
        // System.out.println(pen);

        int data = 10; // primitives go to the stack memory

        Calculator obj1 = new Calculator(); 
        Calculator obj2 = new Calculator();
        // the objects are created on the heap memory
        int r1 = obj1.add(3, 4, 9);
        // System.out.println(r1);

        System.out.println(obj1.num);
        System.out.println(obj2.num);
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

// Object Oriented Programmin
// Object - Properties and behaviors
// we need classes to implement OOP
// JDK - used to compile the java code that is converted to byte code