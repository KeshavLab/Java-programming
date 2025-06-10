//Syntax
//return type functionName( arg1,type arg2 ,..){

          // do something
// }
import java.util.*;
public class functions {

    //define function
//    public static void printMyname(String name){
//        System.out.println(name);
//        return;
//    }

    // addition of two numbers function
//    public static int calculateSum(int a,int b){
//        int sum=a + b;
//        System.out.println(sum);
//        return sum;
//    }

    //multiply of 2 numbers products
//    public static int productOfNumbers(int a,int b){
//        int product=a*b;
//        System.out.println("the product is :"+product);
//        return product;
//
//    }

    // function for Factorial of number

    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("Invalid ");
            return;

        }

        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial *i;

        }
        System.out.println(factorial);
        return;
    }
    


    public static void main(String[] args){
//        System.out.println("Enter your name :");
//        Scanner sc= new Scanner(System.in);
//
//        String name = sc.next();
//
//        printMyname(name);

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a first number :");
//        int a= sc.nextInt();
//
//        System.out.println("Enter a second number :");
//        int b= sc.nextInt();

//        int sum =calculateSum(a,b);
//        System.out.println(sum);
//        int product =productOfNumbers(a,b);


        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number do want factorial:");
        int n= sc.nextInt();
        calculateFactorial(n);

    }
}
