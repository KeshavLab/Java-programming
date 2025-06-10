import java.util.Scanner;

public class strings {


    public static void main(String[] args){

        // Declaration of string
        // String string_name = "value ";
//        String name="keshav";
//        String fullName="keshav prakash kolekar";
//        String sentence= "hi my name is keshav";


        // jab hame user se string input leni ho tab ha "scanner" class ka use karate hai usame "sc" ek object hai

        // hame user se name input leke print karana hai
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your name :");
//        String name= sc.nextLine();     //jab bhi hame  ek single word input lena hota hai tab ham "sc.next()" use karate hai
//                                // jab bhi hame full name or sentance input lena hota hai tab hum "sc.nextLine()" use karate hai
//        System.out.println("Your name is :"+name);



        // Concatination function two strings ko jodane ke liye hum "+" use karate hai
//         String firstName="Keshav";
//         String lastName="Kolekar";
//         String fullName= firstName +lastName;
//        System.out.println(fullName);
//        // length find karani hai to
//        System.out.println(fullName.length());

        //jab hame word ka ek ek character print karana ho to
        //charAt() method use karate hai

//        for(int i=0;i<=fullName.length();i++){
//            System.out.println(fullName.charAt(i));
//        }

        // compaing the string
        String name1 ="keshav";
        String name2= "keshav";
        // compareTo function three conditions check karata hai
        // 1) string>0  hai to +ve value return karega
        //2) string ==0  hai to vo 0 return karega
        // 3) string<0 hai to vo -ve value return karega

//        if(name1.compareTo(name2)==0){
//            System.out.println("Strings are Equal");
//        }
//        else{
//            System.out.println("Strings are not equal ");
//        }

        // ab aap bologe "name1 == name2" lagane ke bad bhi correct answer ata..  yes but "==" most of the time fail ho jata hai
        // ex-

//        if(new String("keshav")==new String("keshav")){
//            System.out.println("strings are equal ");
//        }
//        else{
//            System.out.println("strings are not equal ");
//        }
//
        // to esaka output ayega not equal isiliye hum compareTo function use karate hai
//        substring(starting_index , ending_index)
//        String name= "keshav kolekar";
//        String sub= name.substring(7,11); // ending index exclusive hota hai yani vo include nahi hota
//        System.out.println(sub);

        // Stings are immutable yani agar apane ek string bana di to usake andar aap koi change,add,modify nahi kar sakate
        // agar apako koi bhi change karana hai to apako ek new string banani padegi


    }
}
