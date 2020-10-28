import java.util.Scanner;

public class ProblemSet7 {




    public static void main(String[] args) {}

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
        String first;
        String second;
        String result;

        if (in == null || out == null || out.length() > 4) {
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
    public String endsMeet(String text, int n) {
        String first;
        String second;
        String result;

        if (text == null || text.length() < 1 || n < 1 || n > text.length() || text.length() > 10) {
            result = text;
            return result;
        } else {
            first = text.substring(0, n);
            second = text.substring(text.length() - n);
            result = first.concat(second);

            return result;
        }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        String first;
        String middle;
        String last;
        double n;
        String result;

        if (text == null || text.length() < 3 || text.length() % 2 == 0) {
            result = text;
            return result;
        } else {
            n = Math.ceil(text.length() / 2);
            int l = (int) n;
            middle = text.substring(l, l + 1);
            first = text.substring(l - 1, l);
            last = text.substring(l + 1, l + 2);
            result = first.concat(middle);
            result = result.concat(last);

            return result;
        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        String first;
        String middle;
        String last;
        double n;
        String result;

        if (text == null || target == null || target.length() != 3 || text.length() < 3 || text.length() % 2 == 0) {
            return false;
        } else {
            n = Math.ceil(text.length() / 2);
            int l = (int) n;
            middle = text.substring(l, l + 1);
            first = text.substring(l - 1, l);
            last = text.substring(l + 1, l + 2);
            result = first.concat(middle);
            result = result.concat(last);

            return target.equals(result);
        }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        String suffix1 = Character.toString(suffix);
        int counter = 0;

        if (text == null || text.isBlank() || !(Character.isLetter(suffix)) || suffix1.equals("ㅥ")) {
            return -1;
        } else {
            String [] words;
            words = text.split(" ", 1000);

            for (String word : words) {
                if (word.endsWith(suffix1)) {
                    counter++;
                }
            }

            return counter;
        }


    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        String firstCharacter;
        String secondCharacter;
        String thirdCharacter;
        int counter = 0;

        if (text == null) {
            return -1;
        } else {
            for (int n = 0; (n + 2) < text.length(); n++) {
                firstCharacter = text.substring(n, n + 1);
                secondCharacter = text.substring(n + 1, n + 2);
                thirdCharacter = text.substring(n + 2, n + 3);

                if ((firstCharacter.equals(secondCharacter)) && (secondCharacter.equals(thirdCharacter))) {
                    counter++;
                }
            }

            return counter;
        }

    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {
        char character;
        int sum = 0;
        int number;

        if (text == null) {
            return -1;
        } else {
            for (int n = 0; n < text.length(); n++) {
                character = text.charAt(n);

                if (Character.isDigit(character)) {
                    number = Character.getNumericValue(character);
                    sum += number;
                }
            }

            return sum;
        }

    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        char character;
        char nextCharacter;
        int counter = 1;
        int number = 1;

        if (text == null) {
            return -1;
        } else if (text.equals("")) {
            return 0;
        } else if (text.length() == 1 || text.equals(" ")) {
            return 1;
        } else {
            for (int n = 0; n < text.length(); n++) {
                character = text.charAt(n);

                if (n + 1 == text.length()) {
                    break;
                } else {
                    nextCharacter = text.charAt(n + 1);
                }

                if (character == nextCharacter) {
                    counter++;
                } else {
                    counter = 1;
                }

                if (counter > number) {
                    number = counter;

                }
            }

            return number;
        }

    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {
        char aCharacter;
        char bCharacter;
        String intertwine = "";
        int n = 0;

        if (a == null || b == null) {
            return null;
        } else {


            if (a.length() > b.length()) {
                for (n = 0; n < a.length(); n++) {
                    if (n != b.length()) {
                        aCharacter = a.charAt(n);
                        bCharacter = b.charAt(n);;

                        intertwine = intertwine + aCharacter + bCharacter;
                    } else {
                        break;
                    }
                }

                for (int j = n; j < a.length(); j++) {
                    aCharacter = a.charAt(j);
                    intertwine = intertwine + aCharacter;
                }
            } else if (b.length() > a.length()) {
                for (n = 0; n < b.length(); n++) {
                    if (n != a.length()) {
                        aCharacter = a.charAt(n);
                        bCharacter = b.charAt(n);;

                        intertwine = intertwine + aCharacter + bCharacter;
                    } else {
                        break;
                    }
                }

                for (int j = n; j < b.length(); j++) {
                    bCharacter = b.charAt(j);
                    intertwine = intertwine + bCharacter;
                }
            } else {
                for (n = 0; n < b.length(); n++) {
                    aCharacter = a.charAt(n);
                    bCharacter = b.charAt(n);;

                    intertwine = intertwine + aCharacter + bCharacter;
                }
            }
            return intertwine;
        }


    }
    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {
        char character1;
        char character2;
        int n = 0;


        if (text == null) {
            return false;
        } else {
            int j = text.length() - 1;

            while (n < Math.ceil(text.length() / 2) && j > Math.floor(text.length() / 2)) {
                character1 = text.charAt(n);
                character2 = text.charAt(j);

                if (character1 != character2) {
                    return false;
                }

                n++;
                j--;
            }

            return true;
        }

    }



}
