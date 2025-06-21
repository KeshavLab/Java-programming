//🔹 1. Encapsulation kya hota hai?
//Encapsulation ka matlab hota hai:

//“Data ko chhupana (hide karna) aur access dena sirf methods ke through.”

//Jaise ek capsule ke andar medicine hoti hai — aapko andar ka formula nahi pata, bas kaam karta hai. Waise hi, class ke variables ko private rakhte hain, aur unko access karne ke liye public methods banate hain (getters/setters).

//💡 Real-Life Example:
//Bank account ka example le lo.

//Balance ko directly change nahi kar sakte.

//Sirf deposit() aur getBalance() jaise methods ke through access kar sakte ho.
class BankAccount{
    private int balance =90000;  // set private variable

    //set mmethod (deposit maoney)
    public void deposit(int amount){

        if (amount>=0){
            balance = balance+ amount;
        }
    }

    // get balance
    public int getBalance(){
        return balance;
    }

}



public class Encapsulation {
    public static void main(String[] args){

        // acess the class
        // b.balance = 9999; ❌ Galat - direct access not allowed
        BankAccount b= new BankAccount();
        b.deposit(1000); // ✅ Sahi - method ke through paisa deposit

        System.out.println("your balance is :"+" "+b.getBalance());  // balance is 91000
    }
}

//| Concept            | Explanation in Hinglish              |
//| ------------------ | ------------------------------------ |
//| `private` variable | Data ko direct access se bachata hai |
//| `public` method    | Safe way se access deta hai          |
//| Getter             | Data ko read karne ke liye           |
//| Setter             | Data ko update karne ke liye         |