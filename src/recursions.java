// A function that calls itself is called recuesion


public class recursions {
    //print the number from 5 to 1
//    public static void printNumb(int n){
//        if (n==0){      //base case
//            return;
//        }
//        System.out.println(n);
//        printNumb(n-1);
//    }

    // print number from 1 to 5
    public static void printNumb(int n){
        if(n==6){ //base case
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String[] args){

//        int n=5;
//        printNumb(n);

        //print num from 1 to 5
        int n=1;
        printNumb(n);
    }
}
