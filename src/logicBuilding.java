import java.util.*;
public class logicBuilding {

    public static void main(String[] args){
        //Q1) Check if the year is leap year or not
//        एखादं वर्ष लीप वर्ष आहे जर:
//        1) ते 4 ने भाग जातं
//        2) पण ते 100 ने भाग जात नाही, किंवा...
//        3) 400 ने भाग जात असेल, तर ते लीप वर्ष आहे
        // Rule 1: Divisible by 4 AND not divisible by 100
        // OR Rule 2: Divisible by 400
        Scanner sc= new Scanner(System.in);

//        System.out.println("Enter the year :");
//        int year = sc.nextInt();
//
//        //check codition
//        if((year % 4==0 && year %100 !=0) || year %400 ==0){
//            System.out.println(year+" it is a leap year");
//        }
//        else{
//            System.out.println(year+" it is not leap year");
//        }

        // check if the number is armstrong or not
        System.out.println("Enter a number :");
        int num= sc.nextInt();
        //ham num ko original me store karenge koki hame last me compare karana hai
        int original =num;
        //hame num to string me convert karan hai kuyki hame pata karana hai ki num me kitane digits hai
        int digits = String.valueOf(num).length();

        //sum ko initially ham 0 declare karenge
        int sum=0;
        //ham 1 while loop chalayenge
        while (num != 0){
            int digit= num % 10; // This line gets the last digit of the number. ex (153 % 10 = 3)
            sum+=Math.pow(digit,digits); //ex- (Math.pow(3, 3) = 3 * 3 * 3 = 27  ,sum += 27)

            //This line removes the last digit from the number by dividing it by 10.
            // Example:
            //If num = 153, then:
            //153 / 10 = 15
            num/=10;

        }
        if (sum==original){
            System.out.println("it is an armstrong number");
        }
        else{
            System.out.println("It is not armstrong number");
        }






    }
}
