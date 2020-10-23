import java.util.Scanner;

public class ProblemSet7 {
    public static void main(String[] args) {
        System.out.println(surroundMe("abc", "123"));
        System.out.println(endsMeet("abcdefg", 2));
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    // Retrieve String in and String out
    // Divide String out in half and make it separate substrings
    // Concatenate all the strings together
    public static String surroundMe(String in, String out) {
        String first;
        String second;
        String result;

        if (in == null || out == null || out.length() < 4) {
            result = in;
            return result;
        } else {
            first = out.substring(0, out.length() / 2);
            second = out.substring(out.length() / 2);
            result = first.concat(in);
            result = result.concat(second);

            return result;
        }
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public static String endsMeet(String text, int n) {
        String first;
        String second;
        String result;

        if (in == null || out == null || out.length() < 4) {
            result = in;
            return result;
        } else {
            first = out.substring(0, out.length() / 2);
            second = out.substring(out.length() / 2);
            result = first.concat(in);
            result = result.concat(second);

            return result;
        }




        return "";
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        return "";
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        return true;
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        return 0;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        return 0;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {
        return 0;
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        return 0;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {
        return "";
    }
    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {
        return true;
    }



}
