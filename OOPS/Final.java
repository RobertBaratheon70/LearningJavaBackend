package OOPS;

// final class cannot be extended
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

class Parent {
    // final method cannot be overridden
    public final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // Uncommenting below will cause a compile error
    // public void show() { System.out.println("Trying to override final method"); }
}

public class Final {
    public static void main(String[] args) {
        int a = 10;
        a = 11;
        final int b = 9;
        // b = 10; // cannot be changed because variable is final

        System.out.println("a: " + a);
        System.out.println("b (final): " + b);

        FinalClass fc = new FinalClass();
        fc.display();

        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.show(); // Calls final method from Parent
    }
}
