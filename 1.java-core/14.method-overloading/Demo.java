public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}

class A
{
    public void show () {
        System.out.println("In A show");
    }

    public void config () {
        System.out.println("In A config");
    }
}

class B extends A
{
    @Override
    public void show() {
        System.out.println("In B show");
    }
}

class Calc {
    public int add (int n1, int n2) {
        return n1+n2;
    }
    
}

class AdvCalc extends Calc {
    public int add (int n1, int n2) {
        return n1+n2+1;
    }
}
