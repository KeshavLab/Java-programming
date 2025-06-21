
import java.util.*;
public class practice {

//    public static void printArray(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }

    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static int findSum(int a, int b){
        return a+b;
    }

    public static double calculateAvg(int a, int b, int c){
        return (a+b+c)/3.0;
    }
    public static void main(String[] args){

//        Q1) rectanglr pattern
//        int n=4;
//        int m=5;
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=m;j++){
//                System.out.print("*"+" ");
//
//            }
//            System.out.println();
//        }

        // Q2) HOllow rectangle

//        int n=4;
//        int m=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i==1 || j==1 || i==n || j==m){
//                    System.out.print("*"+" ");
//
//                }
//                else{
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }

        // Q3) pyramid
//        int n=4;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        // Q4) inverted pyramid

//        int n=4;
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }



        // Q5) pyramid
//        int n=4;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//        }

        //Q6) inverted half pyramid
//        int n=4;
//        //outer loop for rows
//        for(int i=1;i<=n;i++){
//            // innner loop for spaces
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" "+" ");
//            }
//            // inner loop for stars
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        int n=5;
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        int n=5;
//        //to control rows
//        for(int i=1;i<=n;i++){
//            //for space
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" "+" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        int n=5;
//        int number=1;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                int sum=i+j;
//                if(sum%2==0){
//                    System.out.print("1"+" ");
//                }
//                else{
//                    System.out.print("0"+" ");
//                }
//            }
//            System.out.println();
//        }


//        int n=4;
//        for(int i=n;i>=1;i--){
//            //spaces
//            int spaces=n-i;
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" "+" ");
//            }
//            //stars
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        // 2D array

//
//        Scanner sc= new Scanner(System.in);
//
//        System.out.println("enter the number of rows :");
//        int rows= sc.nextInt();
//
//        System.out.println("Enter the number of columns :");
//        int columns =sc.nextInt();
//
//        //defining the array
//
//        int[][] numbers=new int[rows][columns];
//
//        System.out.println("Enter the elements :");
//
//        //input
////        rows
//        for(int i=0;i<rows;i++){
//            //columns
//            for(int j=0;j<columns;j++){
//                numbers[i][j]= sc.nextInt();
//            }
//
//        }
//
//        //output
//        System.out.println("The 2D Array is :");
//        for (int i=0;i<rows;i++){
//            for (int j=0;j<columns;j++){
//                System.out.print(numbers[i][j]+" ");
//            }
//            System.out.println();
//        }

//        Scanner sc= new Scanner(System.in);

//        System.out.println("Enter first number :");
//        int a= sc.nextInt();
//
//        System.out.println("Enter the Second number :");
//        int b= sc.nextInt();
//
//        int sum=findSum(a,b);
//        System.out.println("The sum is :"+sum);


        // Avg of two numbers;

//        System.out.println("Enter the  first number :");
//        int a= sc.nextInt();
//
//        System.out.println("Enter the second number :");
//        int b= sc.nextInt();
//
//        System.out.println("Enter the third number :");
//        int c= sc.nextInt();
//
//        double avarage =calculateAvg(a,b,c);
//        System.out.println("The Avarage is :"+avarage);

//        System.out.println("Enter the number :");
//        int num =sc.nextInt();
//
//        boolean isPrime=true;
//
//
//        if(num>1){
//            for (int i=2;i<num;i++){
//                if(num%i==0){
//                    isPrime=false;
//                    break;
//                }
//             }
//            if(isPrime){
//                System.out.println("it is prime number");
//            }
//            else{
//                System.out.println("it is not prime number");
//            }
//
//            }
//        else {
//            System.out.println("Please enter the valid number :");
//        }

        // swapping the two variables (not use temp function)

//        int a=10;
//        int b=20;
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a);
//        System.out.println(b);

        // bubble sort

        //defining the array
//        int arr[]={7,8,3,1,2};
//
//        for(int i=0;i<arr.length-1;i++){
//
//            //compare the elements we create inner for loop
//            for(int j=0;j<arr.length-i-1;j++){
//                if(arr[j]>arr[j+1]){
//
//                    //swap
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        printArray(arr);

        // selection sort

        // defining the array
//        int arr[]={7,8,3,1,2};
//
//        for(int i=0;i<arr.length-1;i++){
//
//            //assume the smallest element i
//            int smallest=i;
//            for(int j=i+1;j< arr.length;j++){
//
//                if(arr[smallest]>arr[j]){
//                    smallest=j;
//                }
//            }
//            //swap
//            int temp=arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//
//        }
//        printArray(arr);

        // bubble sort
        // defining the array
//        int arr[]={7,3,8,6,1};
//
//        //bubble sort
//        for (int i=0;i<arr.length-1;i++){
//
//            //compare two elements
//            for (int j=0;j<arr.length-i-1;j++){
//                if(arr[j] > arr[j+1]){
//
//                    // swap
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        printArray(arr);


        // selection sort

//        int arr[] = {7,8,5,46,3,9};
//
//        for (int i=0;i<arr.length-1;i++){
//            int smallest=i;
//
//            for (int j=i+1;j< arr.length;j++){
//                if (arr[smallest]>arr[j]){
//                    smallest=j;
//                }
//            }
//            //swap
//            int temp=arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//
//
//        }
//        printArray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size= sc.nextInt();

        int number[]= new int[size];

        //inserting the element
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }

        //printing the arry elements
        System.out.println("The array is :");
        for (int i=0;i<size;i++){
            System.out.print(number[i]+" ");
        }






    }

}


