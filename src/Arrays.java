//    Arrays is the list of items of same type
// syntax of an array

//    type[] arrayName=new type[size];
//  ex-
      // int marks[]= new int[20]   20 yani kitane elements  store karane hai

import java.util.*;
public class Arrays {
    public static void main(String[] args){
//        int marks[]=new int[3];
//        marks[0]=67; //physics
//        marks[1]=78; //chemistry
//        marks[2]=89; // maths
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//

//        //agar hame pehale se hi aray ka sizw pata ahia to hum directly bhi array ko define kar sakate hai\
//
//        int marks[] = {67,78,89};
//
//        // par jab hame 100 elements dkhane honge to hum loop lagakar bhi kar sakate hai
//
//        for(int i=0;i<3;i++){
//            System.out.println(marks[i]);
//        }



        // agar hame user se input leke ek array banana hai to
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the size of an Array :");
//        int size= sc.nextInt();
//        System.out.println("Enter the numbers :");
//
//        int number[]= new int[size];
//
//
//        // input from user
//        for(int i=0;i<size;i++){
//            number[i]= sc.nextInt();
//        }
//
//        // printing the output
//        System.out.println("The array is :");
//        for(int i=0;i<=size;i++){
//            System.out.println(number[i]);
//        }



        // Take an array input from the user . Search for a given nuumber x and print the index at which it occurs

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size= sc.nextInt();

        // defining the array
        int numbers[]= new int[size];

        //input
        System.out.println("enter the elements in array :");
        for(int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }

        // search element
        System.out.println("Enter the searching elements :");
        int x= sc.nextInt();

        // output
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]==x){
                System.out.println(" x is found at index :"+i);
            }
            }



    }
}
