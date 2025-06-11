// Strings in java are immutable

// syntax
//StringBuilder string_name = new StringBuilder("value");


public class stringBuilders {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Keshav");
//        System.out.println(sb);
//
//        //we also find the character wit the help of index ( character get karana)
//        // chatAt(0)
//        System.out.println(sb.charAt(0));
//
//        // ham speciffic index per koi bhi character set kar sakate hai (character set karana)
//        sb.setCharAt(0,'p');
//        System.out.println(sb);
//
//        // ham string ke andar koi bhi caracter insert bhi kar sakate hai (Character inseart karana)
//        sb.insert(0,'k');
//        System.out.println(sb);
//
//        // deleting the character or substring
//        sb.delete(1,2);
//        System.out.println(sb);
//
//        // appending the character mean add the char on last of string
//
//        sb.append('r');
//        sb.append('a');
//        sb.append('j');
//        System.out.println(sb);
//        System.out.println(sb.length());


        // Q) reverse the string
//        System.out.println(sb.reverse());

        for(int i=0; i<sb.length()/2;i++){
            int front =i;
            int back =sb.length()-1-i;

            char frontChar= sb.charAt(front);
            char backaChar= sb.charAt(back);

            sb.setCharAt(front,backaChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);

    }
}
