package OOPS;
 class Mobile{
     String brand;
     int price;
     static String name;
     static {
        name="SmartPhone";
        System.out.println("Static variable initialized");
     }
     public Mobile(String brand,int price){
          this.brand=brand;
          this.price=price;
          System.out.println("Constructor called");
     }
public static void show(){
     System.out.println(name);
}
public  void show1(){
     System.out.println(brand);
}

 }

public class Static {
   public static void main(String[] args) {
        Mobile mb=new Mobile("Apple",
        1000);
        Mobile mc=new Mobile("Samsung",500);
        mc.show1();
        Mobile.show();
        System.out.println(Mobile.name);// static variables and method can be accessed by class itself no need to create an object for it this is how static things differe from instance thing 
        mb.show1();
   }
}
