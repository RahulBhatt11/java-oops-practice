package constructors;


class Std{
    String name;
    int rollNo;
    double marks;

    Std(){
        name = "Unknow";
        rollNo = 0;
        marks = 0.0;
        System.out.println("Default Constructor Called");
    }

    Std(String name, int rollNo, double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    Std(String name, int rollNo){
        this(name, rollNo, 0.0);
    }

    void display(){
        System.out.println(name+" "+rollNo+" "+marks);
    }


}


public class Practice {
    public static void main(String[] args) {
        Std S=new Std();
        S.display();

        Std S1=new Std("Ram",12,140.1);
        S1.display();

        Std S2=new Std("Raju",111);
        S2.display();


    }
}
