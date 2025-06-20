import org.w3c.dom.ls.LSOutput;

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
// file ka name hai oops .java isiliye class hai oops
public class OOPS {

    public static void main(String[] args){

        // creating object :- To Reuse Code Easily
        Pen pen1 =new Pen();
        pen1.color="black";
        pen1.type="gel";
        pen1.write();

        // Once you create a class, you can create many objects from it without rewriting code
        Pen pen2=new Pen();
        pen2.color="red";

        pen1.printColor();
        pen2.printColor();

    }
}
