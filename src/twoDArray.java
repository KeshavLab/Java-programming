//Declaration
//   type[][] arrayName= new type[rows][columns];
//   int[][]numbers = new int[3][5];


import java.util.*;
public class twoDArray {
    public static void main(String[]  args){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number of rows :");
//        int rows= sc.nextInt();
//        System.out.println("Enter the number of columns :");
//        int cols= sc.nextInt();
//
//        // defining the array
//        int[][] numbers= new int[rows][cols];
//
//        //input
//        System.out.println("Enter the elements :");
//
//        //rows
//        for(int i=0; i<rows;i++){
//            //columns
//            for(int j=0;j<cols;j++){
//                numbers[i][j]=sc.nextInt();
//            }
//
//        }
//
//
//        // output
//
//        System.out.println("The 2D array is :");
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                System.out.print(numbers[i][j]+" ");
//
//            }
//            System.out.println();
//        }

        // Q1) Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of rows :");
        int rows= sc.nextInt();

        System.out.println("Enter the number of columns :");
        int cols = sc.nextInt();

        // defining the 2D array
        int[][] numbers=new int[rows][cols];

        //input
        //rows
        System.out.println("Enter the elements :");
        for(int i=0;i<rows;i++){
            //cols
            for(int j=0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //searching element
        System.out.println("Enter the searching element :");
        int x= sc.nextInt();

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x is found at index: [" + i + "][" + j + "]");
                }
            }
        }




    }
}

