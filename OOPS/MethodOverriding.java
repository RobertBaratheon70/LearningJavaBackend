package OOPS;
class X{
    public void show(){
        System.out.println("in superClass");
    }   
}
class Y extends X{
    public void show(){
        System.out.println("in sub class");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Y y = new Y(); 
        y.show(); 
        // Y y1=new X(); // This line will cause a compile-time error because you cannot assign a superclass type to a subclass reference.
        X x1=new Y(); //
        x1.show(); // This will call the overridden method in class Y due to dynamic method dispatch.
        // The above line demonstrates polymorphism where a superclass reference points to a subclass object.
    }
}
