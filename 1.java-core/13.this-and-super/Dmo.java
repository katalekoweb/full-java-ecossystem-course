public class Dmo {
    public static void main(String[] args) {
        B obj = new B(10);

    }
}

class A
{
    public A() // default construct
    {
        // every class in Java exted the Object class
        super();
        System.out.println("In A");
    }

    public A(int n) 
    {
        super();
        System.out.println("In A int");
    }
}

class B extends A
{
    public B () {
        // super is always tehre
        super();
        System.out.println("In B");
    }

    public B(int n) 
    {
        this();
        System.out.println("In B int");
    }
}
