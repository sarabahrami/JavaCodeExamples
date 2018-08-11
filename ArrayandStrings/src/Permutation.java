/*Given two strings, write a method to decide if one is a permutation of the other.
appraoch is counting the characters
points: We can increment the value in checker array for characters in str1 and decrement for characters in str2.
Finally, if all count values are 0, then one string is permutation of another one.

 */

import java.util.Arrays;

public class Permutation {
public static void main (String [] args) {
    String str1="abgchfa";
    String str2= "faaohbc";
    if (checkpermutation(str1,str2))
        System.out.println("permutation");
    else
        System.out.println("No permutation");
}



public static boolean checkpermutation (String str1, String str2) {
   if(str1.length()!=str2.length())
       return false;

    int [] checker=new int [256];
    Arrays.fill (checker, 0);
    for (int i=0;i< str1.length();i++) {
        checker[(int)str1.charAt(i)]++;
        checker[(int)str2.charAt(i)]--;
    }

    for (int i=0;i<checker.length;i++)
        if (checker[i]<0)
            return false;

    return true;
}
}
