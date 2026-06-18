import kata.tools.Calc;
import kata.tools.D;

public class Demo {
    public static void main(String[] args) {
        Calc calc = new Calc();

        // maven is a package manager
        D obj = new D();
        System.out.println(obj.marks);
    }
}

// access modifiers
// default can be used in the same package
// private - can be used in the same class
// protected - works in the same package and children classes

// try to keep yur classes publics
// try to keep your vars privates with acessors methods (getters and setters)