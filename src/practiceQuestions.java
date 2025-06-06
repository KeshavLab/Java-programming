import java.util.*;
public class practiceQuestions {

    //function for avarage Q1
    public static double avgCalculator(int a, int b,int c){
        return (a+b+c)/3.0;

    }

    // sumOfOdds function Q2
    public static int sumOfOdds(int n){
        int sum=0;   // initial sum as 0

        for(int i=1;i<=n;i+=2){    // for loop from 1 to n
            sum+=i;
        }
        return sum;
    }

    // greater number function Q3

    public static int findGreaterNum(int a , int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }

    //Circumferance of circle Q4
    public static double circleCircumferance(int r){
        return 2*(3.14159*r);
    }

    public static void main(String[] args){

        //Q1)Enter 3 numbers from user & make function to print their avarage

//        Scanner sc= new Scanner(System.in);
//        // taking first number
//        System.out.println("Enter the first number :");
//        int num1= sc.nextInt();
//
//        // Taking second number
//        System.out.println("Enter second number:");
//        int num2=sc.nextInt();
//
//        //Taking third number
//        System.out.println("Enter third number:");
//        int num3= sc.nextInt();
//
//        // calling function
//        double avg =avgCalculator(num1,num2,num3);
//        System.out.println("The avg value is:"+avg);


        // Q2)write the function to print the sum of all odd numbers from 1 to n

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num= sc.nextInt();
//
//        // call the function
//        int result=sumOfOdds(num);
//        System.out.println("The sum of odd number from 1 to,"+ num +"is:"+result);


        // Q3 Write a function which akes two numbers and returns the grature of those

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int num1= sc.nextInt();
//
//        System.out.println("Enter second number :");
//        int num2= sc.nextInt();
//
//        int result=findGreaterNum(num1,num2);
//        System.out.println("the greater number is :"+result);

        // Q4) Write a function  that takes radius as an input and returns the circumferance of a circle
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int rad=sc.nextInt();

        //calling function
        double radius=circleCircumferance(rad);
        System.out.println("the circumferance of radius"+" "+ rad +" " +"is :-"+radius);














    }

}
