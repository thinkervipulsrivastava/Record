import java.util.Scanner;

/*
1. You are given a string.
2. You have to compress the given string in the following two ways -
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
Input Format
A String
Output Format
Two strings representing first compressed string and second compressed string respectively.
 */



public class DayThreeStringCompression {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println (compressionOne (a));
    }

    private static String compressionOne(String b) {
        // Input : aabbc
        // Output: abc
        // first String
        // if curr != prev
        // s += curr;

        String curr = b.charAt(0) + "";
        String prev = "";

        for (int i = 1; i < b.length(); i ++) {
            prev = b.charAt(i) + "";
            if  (curr != prev) {
                curr += prev;
            }
        }
        return curr;
    }


}
