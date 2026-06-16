public class Strings {
    public static void main(String[] args) {
        String name = "Kata";
        String name1 = new String("Julian");
        // System.out.println(name);
        // System.out.println(name1.hashCode());

        // concatenation
        // System.out.println("Hello " + name);
        // System.out.println(name1);

        // primitives vs references

        // String Constant Pool
        String name2 = "Kataleko";
        name2 = "Kata";

        // Garbage Collect

        // String Buffer is thread safe
        StringBuffer sb = new StringBuffer("Kataleko");
        // sb.append(" Felix");
        sb.insert(0, "Julian ");
        sb.insert(7, " Felix");
        
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        String str = sb.toString();
        System.out.println(str);
    }
}
