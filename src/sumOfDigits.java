
import java.util.*;
public class sumOfDigits {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();

        int sum=0;

        while(num !=0){
            int digit = num % 10; // to find the last number
            sum +=digit;
            num=num/10;  // to remove the last element

        }
        System.out.println("The sum of digits is :"+sum);
    }
}
