import kata.tools.Calc;
import kata.tools.D;

public class Demo {
    public static void main(String[] args) {
        Calc calc = new Calc();

        // maven is a package manager
        D obj = new D();
        System.out.println(obj.marks);

        // Computer obj1 = new Laptop();
        A obj2 = new A();
        obj2.show();

        obj2 = new B();
        obj2.show();

        obj2 = new C();
        obj2.show();
    }
}

class A {
    public void show () {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show () {
        System.out.println("In B show");
    }
}

class C extends A {
    public void show () {
        System.out.println("In C show");
    }
}

class Computer
{

}

class Laptop extends Computer
{

}

// access modifiers
// default can be used in the same package
// private - can be used in the same class
// protected - works in the same package and children classes

// try to keep yur classes publics
// try to keep your vars privates with acessors methods (getters and setters)