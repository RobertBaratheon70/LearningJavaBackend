package OOPS;
  class Math {
      public int add(int a, int b) {
          return a + b;
      }
      public int add(int a, int b,int c) {
          return a + b;
      }
      // method overloading
  }
  class Physics extends Math {
      public int add(int a, int b) {
          return a + b +1;
      }
      // method overriding
  }

public class Polymorphism {
    public static void main(String[] args) {
       Math mt=new Physics();
       // referance of super class and object of subclass also know as dynamic methos dispatch
        System.out.println( mt.add(1,2));
        //method of sub class is called 
    }
  }