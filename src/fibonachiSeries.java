
import java.util.*;
public class fibonachiSeries {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num= sc.nextInt();

        int a=0, b=1;

        for(int i=0;i<=num;i++){
            System.out.print(a+" ");

            //calculate the next value
            int next= a+b;

            // update the values
            a=b;
            b=next;
        }

    }


}
