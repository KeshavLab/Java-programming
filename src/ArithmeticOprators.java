import java.util.Scanner;

public class ArithmeticOprators {
    public static void main(String[] args){
//        int a=20;
//        int b=5;
//        int sum= a+b;
//        int sub=a-b;
//        int mul=a*b;
//        int div = a/b;
//        System.out.println(sum);
//        System.out.println(sub);
//        System.out.println(mul);
//        System.out.println(div);


//        many of doesnt know what is the difference between Print and Println
//        Print ;- jab bhi apako output ek single line me chahiye tab hum print use karate hai
//        println ;- jab bhi hame output separate line me chahiye hota hai tab hum println use karate hai
//        System.out.print("Hello Keshav");
//        System.out.print("Hello Keshav");
//
//        System.out.println("Hello Keshav");
//        System.out.println("Hello Keshav");
//
//        System.out.print("Hello \nKeshav\n");
//        System.out.print("Hello Keshav");


//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//
//        int a=25;
//        int b=10;
//        int sum= 2*(a+b);
//        System.out.println(sum);
//        int ans=(a*b) /(a-b);
//        System.out.println(ans);

//         Input in java
        Scanner sc=new Scanner(System.in);
//        String name = sc.next();
        String name = sc.nextLine();
//        nextInt
//        nextFloat

//        next function sirf ek token leta hai matlab keshav kolekar likha to sirf keshav lega
//        agar apako pura sentance chahiye to apako nextline() function use karana hoga
        System.out.println(name);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println(sum);
    }
}

