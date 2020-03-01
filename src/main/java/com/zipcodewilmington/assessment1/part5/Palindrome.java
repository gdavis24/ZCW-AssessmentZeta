package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer numOfPalindromes = 0;
        for (int i = 0; i < input.length(); i++){
            for (int j = i + 1; j < input.length() + 1; j++){
                if (isPalindromic(input.substring(i, j))){
                    numOfPalindromes++;
//                if (input.charAt(i) == input.charAt(j)){
//                    numOfPalindromes++;
//
//                }
//                else {
//                    i++;
                }
                System.out.println(numOfPalindromes);
            }
        }

        return numOfPalindromes;

    }

    private boolean isPalindromic(String substring)
    {
        StringBuilder revString = new StringBuilder();
        revString.append(substring);
        return substring.equals(revString.reverse().toString());
    }
}
