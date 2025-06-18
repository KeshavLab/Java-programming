
import java.util.*;
public class logicPractice {
    public static void main(String[] args){

//        Q1) Factorial of number

//        Scanner sc= new Scanner(System.in);
//
//        System.out.println("Enter the number :");
//        int num = sc.nextInt();
//
//        int fact =1;
//        for(int i=1;i<=num;i++){
//            fact= fact *i;
//        }
//        System.out.println("The factorial of "+" "+num+" "+"is "+" "+fact);

        // Q2) Fibonachi searies
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num= sc.nextInt();
//
//        int a=0 ,b=1;
//        for (int i=0; i<=num;i++){
//            System.out.print(a+" ");
//
//            int next=a+b;
//
//            //updating the values
//            a=b;
//            b=next;
//        }

        // palidrome  number

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num= sc.nextInt();
//        int original= num;
//
//        int reversed=0;
//        while (num != 0){
//            int digit = num%10;   // to access last digit
//            reversed = reversed *10 +digit;
//            num= num /10;
//        }
//
//        if (reversed == original){
//            System.out.println(original+" It is paldrome number ");
//        }
//        else{
//            System.out.println(original+"It is not palidrome number ");
//        }

        // Q4) check if  the nuber is armstrong or not

//        Scanner sc= new Scanner(System.in);
//
//        System.out.println("Enter the number :");
//        int num = sc.nextInt();
//
//        int original=num;
//        int digits= String.valueOf(num).length();
//
//        int sum=0;
//         while (num != 0){
//             int digit = num %10;
//              sum += Math.pow(digit,digits);
//              num= num/10;
//         }
//         if(sum==original){
//             System.out.println(original+" it is armstrong number ");
//         }
//         else{
//             System.out.println(original+" It is not armstrong number");
//         }

        // count digits

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num= sc.nextInt();
//
//        int count =0;
//        while (num != 0){
//            num = num / 10;
//            count ++;
//        }
//        System.out.println("The count of digit is"+" "+count);

        //Q6) sum of digits

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num= sc.nextInt();
//
//        int sum=0;
//
//        while (num != 0){
//            int digit = num%10;
//            sum= sum+digit;
//            num /=10;
//        }
//        System.out.println("the sum of digits is "+" "+sum);

        // Reversed the number

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int num= sc.nextInt();
//
//        int reversed= 0;
//        while (num!=0){
//            int digit= num%10;
//            reversed = reversed *10 +digit;
//            num = num/10;
//        }
//        System.out.println(" The reversed number is :"+reversed);

        // leap  number
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the year :");
//        int year= sc.nextInt();
//
//        if((year % 4 ==0  && year % 100 != 0) || year % 400==0){
//            System.out.println(" leap year");
//        }
//        else{
//            System.out.println(" It is not leap year");
//        }

        // prime number

        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the number :");
        int num= sc.nextInt();

        boolean isPrime= true;

        if(num > 1){
            for(int i=2;i<num;i++){
                if(num % i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(" it is a prime number ");
        }
        else{
            System.out.println("it is not a prime number ");
        }




    }


}
