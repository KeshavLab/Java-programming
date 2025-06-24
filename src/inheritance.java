//🧠 What is Inheritance in Java?
//Inheritance is one of the four pillars of Object-Oriented Programming.
//It allows a class (child/subclass) to inherit properties and methods from another class (parent/superclass).

//🔹 Why Use Inheritance?
//Reusability: You can use existing code without rewriting it.

//Hierarchy: Establishes a natural relationship like Animal → Dog.

//Extensibility: You can enhance existing classes by adding new features in the subclass.

class Parent{
    public void display(){
        System.out.println("This is Parent Class");
    }
}
class Child extends Parent{
    public void show(){
        System.out.println("This is child class");
    }
        }


public class inheritance {

    public static void  main(String[] args){
        Child obj = new Child();  //This is when you want to access everything in the Child class and everything it inherited from the Parent class.

        obj.show();
        obj.display();

    }
}

//| Type             | Example Description                      | Java Support                        |
//| ---------------- | ---------------------------------------- | ----------------------------------- |
//| **Single**       | One parent → One child                   | ✅ Yes                               |
//| **Multilevel**   | Parent → Child → Grandchild              | ✅ Yes                               |
//| **Hierarchical** | One parent → Many children               | ✅ Yes                               |
//| **Multiple**     | One child inherits from multiple parents | ❌ No (Java uses interfaces instead) |