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
Constraints
1 <= length of string <= 1000
Sample Input
wwwwaaadexxxxxx
Sample Output
wadex
w4a3dex6
 */



public class DaySixStringCompression {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = compressionOne (a);
        System.out.print(b);
        System.out.println (compressionTwo(b));

    }

    private static String compressionOne(String b) {
        // Input : aabbc
        // Output: abc
        // first String
        // if curr != prev
        // s += curr;
        String a = b.charAt(0) + "";

        for (int i = 1; i < b.length(); i ++) {
            char curr = b.charAt(i) ;
             char prev = b.charAt(i -1);
            if  (curr != prev) {
                a += curr;
            }
        }
        return a;
    }

    public static String compressionTwo (String b) {
        // I/P aaabbccdee
        // O/P a3b2c2de2
        String a = b.charAt(0) + " ";
        int count = 1;
        for (int i = 0; i < b.length(); i ++) {
            char curr = b.charAt(i);
            char prev = b.charAt(i - 1);
            if (curr == prev) {
                count ++;
            }
        }
        return "";
    }


}
