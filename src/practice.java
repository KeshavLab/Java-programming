public class practice {
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

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
