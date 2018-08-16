//Write a method to replace all spaces in a string with '%20: You may assume that the
// string has sufficient space at the end to hold the additional characters, and that
// you are given the "true" length of the string. (Note: If implementing in Java,
// please use a character array so that you can perform this operation in place.)

public class ReplaceWhiteSpace {

    public static void main(String args[]) {
        String str = "hi welcome here          ";
       char[] temp=replaceBetterSolution(str.toCharArray(),15);
       for (int i=0;i< temp.length;i++)
           System.out.print(temp[i]);
    }

// this is a naive solution which uses string builder.
        // string builder has amortize insert of o(1) so appending n word is O(n)
        public static String Replace ( char[] str){
            StringBuilder strb = new StringBuilder();
            for (int i = 0; i < str.length; i++) {
                if (str[i] == ' ') {
                    strb = strb.append("%20");
                } else {
                    strb = strb.append(str[i]);
                }

            }
            return strb.toString();

        }

// another solution is to first scan the array and count the number of white spece
// becasue it is mentioned that there is enough space at the end of array we can start
// from the end to replace the white space with %20

    public static char[] replaceBetterSolution(char[] str, int actualLength) {
        int whitecount = 0;
        for (int i = 0; i < actualLength; i++) {
            if (str[i] == ' ')
                whitecount ++;
        }
        int totalcount=(actualLength)+(whitecount*2);
       int j=totalcount-1;
        for (int i=actualLength-1; i>=0;i--){
            if(str[i]!=' '){
                str[j]=str[i];
                j--;
            }else {
                str[j]='0';
                str[j-1]='2';
                str[j-2]='%';
                j=j-3;
            }
        }

        return str;

    }
}