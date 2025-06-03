import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age>18){
//            System.out.println("Adult");
//        }
//        else {
//            System.out.println("Not Adult");
//        }

//       Q1) Even Odd     % - modulo operator matalab
//        Scanner sc= new Scanner(System.in);
//        int num = sc.nextInt();
//        if(num%2==0){
//            System.out.println("It is a Even number");
//        }
//        else{
//            System.out.println("It is an Odd Number");
//        }


//        Q2) take two inputs from user a & b
//        1) a=b print equal//        2)a>b print greater
//        3) a<b print a lesser
//        Scanner sc= new Scanner(System.in);
//
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//
//        if(a==b){
//            System.out.println("Equal");
//        }
//        else if(a>b){
//            System.out.println("a is greater");
//        }
//        else{
//            System.out.println("a is lesser");
//        }


//        Q3) if we press button 1 then print Hello
//        if we press button 2 then print Namaste
//        if we press button 3 then print Bonjour(Fernch hello)

        Scanner sc =new Scanner(System.in);
        int button= sc.nextInt();
//        if(button==1){
//            System.out.println("Hello");
//        }
//        else if(button==2){
//            System.out.println("Namaste");
//        }
//        else if(button==3){
//
//            System.out.println("Bonjour");
//        }
//        else{
//            System.out.println("You enter wrong button plese enter correct button 1, 2 or 3 ");
//        }


//         **-- Switch Case Statements --**
//        above same question we solve using switch case statement
        switch (button){
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Naaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid button");

        }
    }
}
// Aap single if statement bina curly braces ke likh sakate ho but apake agar multiple if statements hai to apako {} braces use
// karana hoga nahi to vo sirf first condition check karane ke bad terminate ho jayega