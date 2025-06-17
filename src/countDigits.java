
import java.util.*;
public class countDigits {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int num= sc.nextInt();

        int count=0;

        if (num==0){
            count=1;
        }
        else{
            while (num !=0){
                num= num/10;
                count++;
            }
        }

        System.out.println("The count of digit is "+count);

    }
}
