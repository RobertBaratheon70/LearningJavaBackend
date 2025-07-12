  package OOPS;
    class Calculator {
        int a;
        int b;

        public int add(int a, int b) {
            return a + b;
        }
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    public class MethodOverLoading {
        public static void main(String[] args) {
            Calculator c = new Calculator();
            int result = c.add(5, 10);
            int result2 = c.add(5, 10, 15);
            System.out.println("The sum is: " + result);
            System.out.println("The sum of three numbers is: " + result2);
        }
    }