//✅ What is Method Overriding?
//Method Overriding means:

//👉 A child class writes its own version of a method that is already defined in the parent class.

//🔸 Real-Life Example:
//Let’s say you and your father both use the same word: "work"

//Your father's meaning: job in office

//Your meaning: studying for exams

//➡️ Same method name (work()), but different action

//This is called method overriding!
class Animal{
    public void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}


public class overriding {
    public static void main(String[] args){
        Animal a= new Animal();
        a.sound(); // animal sound

        Dog d= new Dog();
        d.sound(); // dog barks
    }
}

//| Type             | Description                        |
//| ---------------- | ---------------------------------- |
//| **Compile-time** | Also called **Method Overloading** |
//| **Run-time**     | Also called **Method Overriding**  |