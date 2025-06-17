
import java.util.*;
public class reverseNum {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int reversed =0;

        while (num !=0){
            int digit= num %10;  // to find the last element
            reversed = reversed *10+digit;
            num = num/10; // to remove the last element
        }
        System.out.println("the reversed number is :"+" "+reversed);

    }
}
