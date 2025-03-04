package oops1;
public class Person {
 
    private String name;
    private int age;

    
    public Person(String name) {
        this.name = name;
        this.age = 18; // Default age is 18
    }

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    
    public static void main(String[] args) {
       
        Person person1 = new Person("Syed Kalaam");
        person1.display();

       
        Person person2 = new Person("Arun", 25);
        person2.display();
    }
}
