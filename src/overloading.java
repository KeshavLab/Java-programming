// Overloading :-
//💡 First: What is Overloading?
//🔸 Method Overloading = Same name, but different input
//👉 Jab ek hi naam ke method ko alag-alag parameters ke saath likhte ho, usko method overloading kehte hain.

//✅ Real-life example:
//You unlock your phone:

//With fingerprint

//With password

//With face

//➡️ Kaam same: "unlock"
//➡️ Tarika alag-alag: finger, password, face

//💡 Why Do We Use Overloading?
//1. ✅ Code readability and clarity
//Instead of giving different names to similar tasks (addTwo(), addThree()), you use the same method name like add().

//2. ✅ Avoid repeating logic
//You can reuse the same method name for different types or number of inputs.

//3. ✅ Makes code flexible
//It allows a method to handle different types of data easily.
class Calculator{

    public void add(int a,int b){
        System.out.println("Sum is :"+" "+(a+b));
    }

    // Overloadiing (ek hi naam ke method ko diffrent parameters ke sath likhate hai)
    public void add(int a,int b,int c){
        System.out.println("Sum is :"+" "+(a+b+c));
    }
}


public class overloading {

    public static void main(String[] args){
        //call the constructor
        Calculator calc = new Calculator();
        calc.add(2,4); // 2 parameter
        calc.add(2,3,4); // three parameter


    }
}
