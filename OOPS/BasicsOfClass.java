

package OOPS;

class Calculator {
    int a;
    int b;

    public int add(int a, int b) {
        return a + b;
    }
}

public class BasicsOfClass {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}
