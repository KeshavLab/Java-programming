
import java.util.*;

public class AdvancePattern {
    public static void main(String[] args){

        // Q1) Butterfly pattern
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the number of stars that you want to print:");
        int n=sc.nextInt();

//
//        // Upper half
//        for(int i=1;i<=n;i++){
//
//            // 1st part
//            for(int  j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            // 1 part spaces
//            int spaces=2*(n-i);
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//
//            // stars
//            for(int  j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // Lower  half
//        for(int i=n;i>=1;i--){
//
//            // 1st part
//            for(int  j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            // 1 part spaces
//            int spaces=2*(n-i);
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//
//            // spaces
//            for(int  j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Q2) rhombous patern
//             *****
//            *****
//           *****
//          *****

//        for(int i=1;i<=n;i++){
//            //spaces
//            int spaces=(n-i);
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            // stars
//            for(int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Number Pyramid
//              1
//             2 2
//            3 3 3
//           4 4 4 4
//          5 5 5 5 5
//        for(int i=1;i<=n;i++){
//            // spaces
//            int spaces=n-i;
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//
//        }

        // Q3) Pallindromic pattern
//               1       // agar i=1 hai to 1 to 1 print karavana hai
//             2 1 2    // agar i=2 hai to 2 to 1 print karavana hai
//           3 2 1 2 3   // agar i=3 hai to 3 to 1 print karavana hai
//         4 3 2 1 2 3 4    // agar i=4 hai to 4 to 1 print karavana hai
//       5 4 3 2 1 2 3 4 5      // agar i=5 hai to 5 to 1 print karavana hai
                            // First part mai loop backword chalata hai and second half mai loop forward chalata hai


//        for (int i=1;i<=n;i++){
//
//            //spaces
//            int spaces=n-i;
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" "+" ");
//            }
//
//            // 1 half numbers
//            for(int j=i;j>=1;j--){
//                System.out.print(j+" ");
//            }
//
//            // 2 half numbers
//            for(int j=2;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // Q5) Diamond pattern

//                 *
//                * *
//               * * *
//              * * * *
//              * * * *
//               * * *
//                * *
//                 *

         // 1 half
        for(int i=1;i<=n;i++){

            //spaces
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // 2 half
        for(int i=n;i>=1;i--){

            //spaces
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
