// Syntax:   // class ka name hamesha Cpatital letter se shuru hota hai and functions ke names byconvention small letter
// se start hote hai
// class className{
//    // do something
//      }


import javax.xml.namespace.QName;

//class is  a bluprint or template
class Pen{
    // properties & behavior of pen
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    // Agar hame pens ka color print karana hai to
    public void printColor(){
        System.out.println(this.color);
    }
}

// student class
class Student{
    String  name;
    int age;


    // function to print name and age of student
    public  void printNameAge(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


// file ka name hai oops .java isiliye class hai oops
public class OOPS {

    public static void main(String[] args){

        // creating object :- To Reuse Code Easily
//        Pen pen1 =new Pen();
//        pen1.color="black";
//        pen1.type="gel";
//        pen1.write();
//
//        // Once you create a class, you can create many objects from it without rewriting code
//        Pen pen2=new Pen();
//        pen2.color="red";
//
//        pen1.printColor();
//        pen2.printColor();


        // objects of student
        Student student1 = new Student();
        student1.name="Keshav";
        student1.age=22;

        Student student2 =new Student();
        student2.name="rajesh";
        student2.age= 25;

        student1.printNameAge();
        student2.printNameAge();





    }
}
