/* Write a Java program to create a class called "Person" with a name and age attribute.
 Create two instances of the "Person" class, 
set their attributes using the constructor, and print their name and age. */

class Person{
    String name;
    int age;

    Person(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name+" "+age);
    }



}
public class Ques1 {
    public static void main(String[] args) {
        Person p1= new Person("Rahul",22);
        Person p2= new Person("Sita",13);
        p1.display();
        p2.display();
    }
    
}
