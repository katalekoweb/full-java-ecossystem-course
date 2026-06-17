public class Names {
    public static void main(String[] args) {
        // camel casing

        // class and interface -> Calc, Runable
        // vars and methods -> marks, show
        // consts -> PIE, BRAND

        // 2 letters
        // showMark()
        // MyData

        // age, DATA, MY_DATA, Human()

        int marks;
        marks = 90;

        A obj = new A();
        obj.show();
    }
}

class A 
{
    public A()
    {
        System.out.println("In constructor");
    }
    
    public void show () 
    {
        System.out.println("In show");
    }
}
