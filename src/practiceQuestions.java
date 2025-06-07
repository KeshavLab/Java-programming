import java.util.*;
public class practiceQuestions {

    //function for avarage Q1
    public static double avgCalculator(int a, int b, int c) {
        return (a + b + c) / 3.0;

    }

    // sumOfOdds function Q2
    public static int sumOfOdds(int n) {
        int sum = 0;   // initial sum as 0

        for (int i = 1; i <= n; i += 2) {    // for loop from 1 to n
            sum += i;
        }
        return sum;
    }

    // greater number function Q3

    public static int findGreaterNum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //Circumferance of circle Q4
    public static double circleCircumferance(int r) {
        return 2 * (3.14159 * r);
    }

    // Q5) vote function
    public static void voteEligible(int n) {
        if (n > 18) {
            System.out.println("your age is" + " " + n + " " + "and you are eligible for vote");
            return;
        } else {
            System.out.println("your age is" + " " + n + " " + "and you are not eligible for vote !!!");
            return;
        }
    }

    public static int powerCalculator(int x, int n){
        int result =1;
        for(int i=1;i<=n;i++){
            result= result *x;
        }
        return result;

    }

    // Q 9)  FInd GCD
    public static int findGcd(int a ,int b){
        while(b!=0){
            int temp=b;
            b= a % b;
            a=temp;
        }
        return a;

    }

    public static void main(String[] args) {

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
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the radius of the circle:");
//        int rad=sc.nextInt();
//
//        //calling function
//        double radius=circleCircumferance(rad);
//        System.out.println("the circumferance of radius"+" "+ rad +" " +"is :-"+radius);

        // Q5) write a function that takes age in nput and return if that person is eligible to vote or not.
        // A person age >18 is eligible for vote

//        Scanner sc= new Scanner(System.in);
//
//        System.out.println("Enter your age :");
//        int age=sc.nextInt();
//
//        voteEligible(age);


        // Q6) Write an infinite loop using do while condition

//        int i=0;
//
//        do{
//            System.out.println("keshav");
//            i++;
//        }while(i>0);

        // Write a program to enter the nmber till the user wants and at the end it should display the count of positive
        // ,neagative and zero entered

//        Scanner sc = new Scanner(System.in);
//
//        int positiveCount = 0;
//        int neagativeCount = 0;
//        int zeroCount = 0;
//
//        char choice;
//
//        do {
//            System.out.println("Enter a number :");
//            int n = sc.nextInt();
//
//            if (n > 0) {
//                positiveCount++;
//            } else if (n < 0) {
//                neagativeCount++;
//            } else {
//                zeroCount++;
//            }
//            System.out.println("Do you want enter the number again (Y/N): ");
//            choice = sc.next().charAt(0);
//
//        } while (choice == 'y' || choice == 'Y');
//
//        //Displaying the result
//        System.out.println("Count of positive :"+positiveCount);
//        System.out.println("Count of neagative"+neagativeCount);
//        System.out.println("Count of zero:"+zeroCount);







        // Q8) Two numbers are entered by the user,x and n . write a function to find the values of  one raised to the power of
        // another i.e x raised to n

//        Scanner sc= new Scanner(System.in);
//
//        System.out.println("Enter the base number :");
//        int x = sc.nextInt();
//
//        System.out.println("Enter the power element :");
//        int n= sc.nextInt();
//
//        int res= powerCalculator( x, n);
//        System.out.println("The result is:"+ res);


        // Q9)  write a function that calculate the GCD of  2 element

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter te second number: ");
        int num2= sc.nextInt();

        int GCD=findGcd(num1, num2);
        System.out.println("The GCD Of"+" "+num1+" "+num2+" "+" is :"+GCD);










    }
}