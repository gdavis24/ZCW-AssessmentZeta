package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String Sentence = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return Sentence;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--){
            output = output + str.charAt(i);
        }
        return output;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--){
            output = output + str.charAt(i);
        }
        String reverseCamel = output.substring(0, 1).toUpperCase() + output.substring(1).toLowerCase();
        return reverseCamel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String invert = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            boolean check = Character.isUpperCase(c);
            if (check == true){
                invert = invert + Character.toLowerCase(c);
            }
            else{
                invert = invert + Character.toUpperCase(c);
            }
        }
        return invert;
    }
}
