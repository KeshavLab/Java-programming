public class patterns {
    public static void main(String[] args){

        //Q1) Print the pattern
             //*****
             //*****
             //*****
             //*****

//        for(int i=0;i<4;i++){
//            System.out.println("*****");
//        }

        // OR

//        for(int i=0;i<4;i++){  // aap int n=4 and int m=5 pehale define karake i<n & j<n bhi likh sakate ho ya fir
//            for(int j=0;j<5;j++){    //aap n & m ko user se input bhi likh sakate ho
//                System.out.print("*");   // println nahi likha kyu ki usase ek new line create ho jati
//            }
//            System.out.println();
//        }

        // Q2) Print the pattern (Hollow rectangle)
//        *****
//        *   *
//        *   *
//        *****

//        int n=4;
//        int m=5;
//
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<=m;j++){
//                if (i==1 || i==n || j==1 || j==m){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        // Q3) Print the pattern (Half Pyramid)
//         *
//         **
//         ***
//         ****

//        int n=4;
//         // Outer Loop
//        for(int i=1;i<=n;i++){
//            // Inner Loop
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();  // har line ke bad space print karata hai
//        }


        // Q4) Print the pattern (inverted pyramid)
//        ****
//        ***
//        **
//        *

//        int n=4;
//        for(int i=n;i>=1;i--){   // only outerloop conditions are changed
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Q5) Print the pattern (Inverted half pyramid)
//               *
//              **
//             ***
//            ****

              // three loops are used
              // 1) print the rows
              // 2) print the spaces  (n-i) spaces
              // 3) print  the stars

//        int n=4;
//        for(int i=1;i<=n;i++){
//            //innner loop for spaces
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            // inner loop for stars
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

          // Q6) Print the pattern(pyramid with numbers)
//        1
//        12
//        123
//        1234
//        12345

//        int n=5;
//
//        for(int i=1; i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //Q7) print the pattern(inverted pyramid with numbers)
//        12345
//        1234
//        123
//        12
//        1

//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){   // ye thoda alag trick se kiya paer ham pehale wala bhi use kar sakate hai
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Q8)print the pattern( Floyd's pattern)
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

//        int n=5;
//        int number =1;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(number+" ");
//                number++; //number=number + 1
//            }
//            System.out.println();
//        }


        //Q9) Print the pattern ( 0-1 Tringle )
//        1     // agar sum even aa raha hai to 1 print ho raha hai & odd aa raha hai to 0 print ho raha hai
//        01
//        101
//        0101
//        101010

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

        // Q10) pyramid
        int n=4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }


    }

}

