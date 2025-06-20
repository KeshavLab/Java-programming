// types of constructor
//1) Non-parameterized constructor
// 2) parameterized constructor
// 3) copy constructor/

class Mobile{
    String name;
    float price;


    //constructor parameterized
    Mobile(String mobileName, int mobilePrice){
        name=mobileName;
        price=mobilePrice;
    }

    // to display the mobile information
    public void mobileInfo(){
        System.out.println("name ="+" "+name);
        System.out.println("name ="+" "+price);
    }
}



public class constructor {
    public static void main(String[] args){

        Mobile m1= new Mobile("oppo",20000);

        // print info
        m1.mobileInfo();

    }
}
