public class Main {
    public static void main(String[] args){

        // Wrapper Classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object
        //                   Allows use of Collections Framework and static Utility Methods

        /*
        // Autoboxing

        Integer a = 2314;
        Double b = 13.24;
        Character c = '$';
        Boolean d = true;
        String e = "Pizza";

        // Unboxing
        int x = a;

        System.out.println(x);



        String a = Integer.toString(232);
        String b = Double.toString(52.31);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        System.out.println(x);

         */

        char letter1 = 'b';
        char letter2 = 'B';
        //char letter = '$';

        System.out.println(Character.isLetter(letter1)); // returning a boolean
        System.out.println(Character.isUpperCase(letter2));
    }
}
