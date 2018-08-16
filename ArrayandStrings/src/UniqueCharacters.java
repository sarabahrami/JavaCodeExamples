import java.util.Arrays;

/*
Is Unique: Implement an algorithm to determine if a string has all unique characters.
 What if you cannot use additional data structures?*/
// time complexity o(n)
// points: Arrays.fill(stringCheck,false) to initilize the array to false value
//(int) tempstr.charAt(i) cast a character to int (asci code)
public class UniqueCharacters {
    final static int MaxChar = 256;

    public static void main(String args[]) {
        String tempstr = "abcdefghij";
        if (matchchecking(tempstr)==true)
            System.out.println("unique");
        else
            System.out.println("not unique");


    }

    public static boolean matchchecking(String tempstr) {
        boolean[] stringCheck = new boolean[MaxChar];
        Arrays.fill(stringCheck,false);
        for (int i = 0; i < tempstr.length(); i++) {
            if (stringCheck[(int) tempstr.charAt(i)] == true)
                return false;

            else
                stringCheck[(int) tempstr.charAt(i)] = true;
        }
        return true;

    }

}
