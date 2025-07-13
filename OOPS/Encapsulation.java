package OOPS;

class Human {
  private int age;
  private String name;

  public Human(int age, String name) {
    this.age = age; 
    this.name = name; 
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    Human human = new Human(20, "John");
    System.out.println("Age: " + human.getAge());
    System.out.println("Name: " + human.getName());
    human.setAge(25);
    human.setName("Doe");
    System.out.println("Updated Age: " + human.getAge());
    System.out.println("Updated Name: " + human.getName());
  }
}
