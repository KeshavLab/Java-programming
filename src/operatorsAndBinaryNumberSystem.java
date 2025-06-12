//Operators
//Arithmetic operators
//     "+" - Addition
//     "-" - Substraction
//     "*" - multiplication
//     "/" - divide
//     "%" - modulo operator

// Unary Operator( ek hi operand ke uper perform hote hai isiliye use unary operator kehate hai)
// Types of unary operators :
//  ++ (increment)
//  -- (decrement)
public class operatorsAndBinaryNumberSystem {
    public static void main(String[] args){

        //pre-increment( ++a )
//        int a=10;
//        int b=0;
//        b= ++a;  //pehale ham value ko change karenge bad me usako assign karenge
//        System.out.println(a);
//        System.out.println(b);

        // post increment
//        int a=10;
//        int b=0;
//        b=a++;  // pehale ham value ko assign karenge bad me usako change jarenge b=a(++)
//        System.out.println(a);
//        System.out.println(b);

        // pre- decrement
//        int a=10;
//        int b=0;
//
//        b=--a;  // pehale ham value ko decrement karenge bad me usako use karenge b= --(a)
//        System.out.println(a);
//        System.out.println(b);

        // post decrement

        int a=10;
        int b=0;   // sabase pehalle ham  b ko value denge  10 and  usake bad a ko change karenge yani a-- (10-1=9) then a=9

        b= a--;
        System.out.println(a);
        System.out.println(b);


    }
}

