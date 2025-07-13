package OOPS;
  class A{
      public A() {
          super(); // Every class in Java extends Object. Calling super() here means calling the constructor of Object class.
          System.out.println("Constructor of A");
      }
      public A(int x) {
          System.out.println("Constructor of A with parameter: " + x);
      }
  }
// Class A demonstrates constructor overloading and the use of super() to call the parent (Object) class constructor.
// The parameterized constructor allows passing an integer to differentiate constructor calls.
class B extends A{
      public B() {
          super(5);  // Calls the parameterized constructor of superclass A
          // If not specified, super() would call the default constructor of superclass
          System.out.println("Constructor of B");
      }
      public B(int x) {
          this(); // Calls the default constructor of the same class (B)
          System.out.println("Constructor of B with parameter: " + x);
      }
  }
// Class B extends A and demonstrates constructor chaining using this() and super().
// The default constructor of B calls the parameterized constructor of A.
// The parameterized constructor of B calls its own default constructor before printing its own message.
public class Inheritance {
  public static void main(String[] args) {
      B b = new B(5); 
      // This creates an object of B using the parameterized constructor.
      // The constructor chain is:
      // B(int x) -> B() -> A(int x)
      // Output will show the order of constructor calls.
  }
}
// The Inheritance class contains the main method to demonstrate constructor chaining and inheritance in Java.
// When B b = new B(5) is executed, it shows how constructors in both parent and child classes are invoked.

