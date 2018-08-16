
//Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin- drome. A palindrome is a word
// or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.The palindrome does not need
// to be limited to just dictionary words. EXAMPLE
        //Input: Tact Coa
       // Output: True (permutations: "taco cat". "atco cta". etc.) Hints: #106, #121, #134, #136
//solution: To be more precise, strings with even length (after removing all non-letter
// characters) must have all even counts of characters. Strings of an odd length must
// have exactly one character with an odd count.

import java.util.Arrays;

public class Palindrome {
    public static void main (String args[]) {
        String str="tactcoapapa";
        if (PalindromPermutation(str))
            System.out.println("string is a PalindromPermutation");
            else
            System.out.println("string is not a PalindromPermutation");

    }
    public static boolean PalindromPermutation(String str) {
        int [] frequency=new int [256];
        Arrays.fill(frequency,0);
        for (int i=0; i< str.length();i++){
            frequency[(int)str.charAt(i)]++;
        }

        return checkIsEvenOrOdd(frequency);


    }

    public static boolean checkIsEvenOrOdd(int []frequency) {
        boolean foundodd=false;
        for (int i=0; i< frequency.length;i++){
            if (frequency[i]%2!=0){
                if(foundodd){
                    return false;
                }
               foundodd=true;
            }

        }
        return true;
    }
}
