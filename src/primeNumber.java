
import java.util.*;
public class primeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num= sc.nextInt();
        boolean isPrime=true;

        if (num>1){
            for (int i=2;i<num;i++){
                if (num %i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("It is prime number");
        }
        else{
            System.out.println(" It is not a prime number");

        }

    }
}
