//🔹 2. Abstraction kya hota hai?
//Abstraction ka matlab hota hai:

//“Sirf important cheezein dikhana aur details chhupana.”

//Aapko kya karna hai woh batata hai, lekin kaise karna hai woh nahi batata.

//💡 Real-Life Example:
//Socho aap bike chala rahe ho:

//Aapko sirf start button dabana hai.

//Bike kaise engine start karti hai, petrol kaise jata hai — ye sab hide hota hai.

//👉 Yehi Abstraction hai.


// Abstract class
abstract class Vehical {
    // Abstract method - no body
    abstract void startEngine();
}

// Child class 1 - Car
class Car extends Vehical {
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}

// Child class 2 - Bike
class Bike extends Vehical {
    @Override
    void startEngine() {
        System.out.println("Bike engine started");
    }
}

// Main class to test
public class Abstraction {
    public static void main(String[] args) {
        Vehical v;

        v = new Car();
        v.startEngine();  // Output: Car engine started

        v = new Bike();
        v.startEngine();  // Output: Bike engine started
    }
}
//| Concept         | Meaning in Hinglish                                    |
//| --------------- | ------------------------------------------------------ |
//| Abstract class  | Aisi class jisme kuch methods incomplete hote hain     |
//| Abstract method | Sirf naam diya jata hai, body nahi hoti                |
//| Subclass        | Abstract class ko extend karke method define karta hai |
