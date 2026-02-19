/*Question:

Write a Java program to create a class called "Student" with the following attributes:

name

rollNumber

marks

Create a parameterized constructor to initialize these attributes when the object is created.

Create two student objects using the constructor and display their details.
 */
class Chatra{
    String name;
    int rollNumber;
    int marks;

    Chatra(String n, int r, int m){
        name=n;
        rollNumber=r;
        marks=m;
    }
    void display(){
        System.out.println(name+" "+rollNumber+" "+marks);
    }
}

public class Ques2 {
    public static void main(String[] args){
        Chatra c1=new Chatra("Raj",1,12);
        Chatra c2=new Chatra("Mira", 77,88);
        c1.display();
        c2.display();
    }
    
}
