import java.sql.SQLOutput;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        double num1, num2, num3, result;
        char operator;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number:");
        num1=sc.nextDouble();

        System.out.println("Enter and operrator ('+' , '-' , '*' , '/' )");
        operator=sc.next().charAt(0);

        System.out.println("Enter second number:");
        num2=sc.nextDouble();

        switch (operator){

            case '+':
                result=num1 + num2 ;
                System.out.println("Result:"+result);
                break;
            case '-':
                result=num1 - num2;
                System.out.println("Result:"+result);
                break;

            case '*':
                result= num1 * num2;
                System.out.println("Resuult:"+result);
                break;

            case '/':
                if (num2 !=0){
                    result=num1 /num2;
                    System.out.println("Result"+result);
                }
                else {
                    System.out.println("Error !!! : Cannot divide by zero");
                }
                break;

        }

    }
}
